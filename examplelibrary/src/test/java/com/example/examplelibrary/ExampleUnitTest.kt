package com.example.examplelibrary

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun exampleSum() {
        val library = ExampleLibrary()
        val sum = library.sum(2, 2)
        // THEN
        assertThat(sum).isEqualTo(4)
    }

    @Test
    fun exampleSub() {
        val library = ExampleLibrary()
        val sum = library.sub(2, 2)
        // THEN
        assertThat(sum).isEqualTo(0)
    }
}