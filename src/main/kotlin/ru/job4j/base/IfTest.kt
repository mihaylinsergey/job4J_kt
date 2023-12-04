package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IfTest {

    @Test
    fun whenCompare1And2Then2() {
        assertThat(max(1, 2)).isEqualTo(2)
    }

    @Test
    fun whenCompare1And2And2And3Then3() {
        assertThat(max(1, 2, 3)).isEqualTo(3)
    }

    @Test
    fun whenCompare1And2And2And3And4Then4() {
        assertThat(max(1, 2, 3, 4)).isEqualTo(4)
    }
}