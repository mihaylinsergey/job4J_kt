package ru.job4j.safe

class BankService {
    private val users: HashMap<User, ArrayList<Account?>> = HashMap()

    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String?, requisite: String?): Account? {
        val user: User? = findByPassport(passport)
        if (user == null) {
            return null
        }
        return users[user]?.stream()
            ?.filter { account -> account?.requisite == requisite }
            ?.findFirst()
            ?.orElse(null)
    }

    fun addAccount(passport: String?, account: Account?) {
        val user: User? = findByPassport(passport)
        users[user]?.add(account)
    }

    fun findByPassport(passport: String?): User? {
        for (user in users.keys) {
            if (user.passport  == passport) {
                return user
            }
        }
        return null
    }

    fun transferMoney(
        srcPassport: String?, srcRequisite: String?,
        destPassport: String?, descRequisite: String?, amount: Double
    ): Boolean {
        val source: Account? = findByRequisite(srcPassport, srcRequisite)
        val dest: Account? = findByRequisite(destPassport, descRequisite)
        var rsl = false
        if (source != null && dest != null) {
            source.balance = source.balance.minus(amount)
            dest.balance = dest.balance.minus(amount)
            rsl = true
        }
        return rsl
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bank = BankService()
            bank.addUser(User("321", "Petr Arsentev"))
            var user: User? = bank.findByPassport("3211")
            println(if (user != null) user.name else null)
            user = bank.findByPassport("321")
            println(if (user != null) user.name else null)
        }
    }
}

data class User(var passport: String, var name : String)

data class Account(var requisite : String, var balance : Double)