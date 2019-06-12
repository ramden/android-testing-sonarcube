package com.example.testing

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.google.common.truth.Truth.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleActivityUnitTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun exampleTest1() {
        // WHEN
        activityRule.activity.finish()

        // THEN
        assertThat(activityRule.activity).isNotEqualTo(null)
    }

    @Test
    fun exampleTest2() {
        // THEN
        assertThat(activityRule.activity.title).isEqualTo("Some title")
    }

    @Test
    fun exampleTest3() {
        // THEN
        assertThat(activityRule.activity.title).isNotEqualTo("Some title x")
    }

    @Test
    fun exampleSum() {
        val sum = activityRule.activity.sum(2, 2)
        // THEN
        assertThat(sum).isEqualTo(4)
    }

    @Test
    fun exampleSub() {
        val sum = activityRule.activity.sub(2, 2)
        // THEN
        assertThat(sum).isEqualTo(0)
    }
}