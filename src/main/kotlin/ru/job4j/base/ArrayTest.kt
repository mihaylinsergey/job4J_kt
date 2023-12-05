package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ArrayTest {

    @Test
    fun whenDefragmentArray() {
        val array = arrayOf("a", null, "b", null, "c")
        defragment(array)
        assertThat(array).isEqualTo(arrayOf("a", "b", "c", null, null))
    }
}