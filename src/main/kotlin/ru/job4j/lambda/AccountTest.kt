package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun testFilterAccount() {
        val list = listOf<Account>(
            Account("Ivan", 100),
            Account("Ivan", -100),
            Account("Petr", 1000000)
        )
        val result = filterAccount(list)
        assertThat(listOf(Account("Ivan", 100))).isEqualTo(result)
    }
}