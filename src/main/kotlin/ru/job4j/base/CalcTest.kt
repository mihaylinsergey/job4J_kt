package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class CalcTest {
    @Test
    fun when1Plus1() {
        assertThat(add(1, 1)).isEqualTo(2)
    }

    @Test
    fun when1Minus1() {
        assertThat(subtract(1, 1)).isEqualTo(0)
    }

    @Test
    fun when1Multiply1() {
        assertThat(multiply(1, 1)).isEqualTo(1)
    }

    @Test
    fun when1DIvide1() {
        assertThat(divide(1, 1)).isEqualTo(1)
    }
}