package ru.job4j.oop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class TrackerTest {

    @Test
    fun testAdd() {
        val tracker = Tracker()
        val item = Item(name = "Item1")
        val result = tracker.add(item)
        assertThat(item).isEqualTo(result)
    }

    @Test
    fun testFindById() {
        val tracker = Tracker()
        val item1 = Item(name = "Item1")
        val item2 = Item(name = "Item2")
        tracker.add(item1)
        tracker.add(item2)
        assertThat(item1).isEqualTo(tracker.findById(1))
        assertThat(item2).isEqualTo(tracker.findById(2))
        assertNull(tracker.findById(3))
    }

    @Test
    fun testFindAll() {
        val tracker = Tracker()
        val item1 = Item(name = "Item1")
        val item2 = Item(name = "Item2")
        tracker.add(item1)
        tracker.add(item2)
        val result = tracker.findAll()
        assertThat(listOf(item1, item2)).isEqualTo(result)
    }

    @Test
    fun testFindByName() {
        val tracker = Tracker()
        val item1 = Item(name = "Item1")
        val item2 = Item(name = "Item2")
        val item3 = Item(name = "Item1")
        tracker.add(item1)
        tracker.add(item2)
        tracker.add(item3)
        val result = tracker.findByName("Item1")
        assertThat(listOf(item1, item3)).isEqualTo(result)
    }

    @Test
    fun testReplace() {
        val tracker = Tracker()
        val item1 = Item(name = "Item1")
        val item2 = Item(name = "Item2")
        tracker.add(item1)
        tracker.replace(1, item2)
        assertThat(item2).isEqualTo(tracker.findById(1))
    }

    @Test
    fun testDelete() {
        val tracker = Tracker()
        val item1 = Item(name = "Item1")
        val item2 = Item(name = "Item2")
        tracker.add(item1)
        tracker.add(item2)
        tracker.delete(1)
        assertNull(tracker.findById(1))
    }
}