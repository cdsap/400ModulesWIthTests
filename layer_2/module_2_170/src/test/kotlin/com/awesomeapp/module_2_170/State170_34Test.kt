package com.awesomeapp.module_2_170

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.awesomeapp.module_2_170.*


@OptIn(ExperimentalCoroutinesApi::class)
class State170_34Test {
        @Test
    fun `test loading state`() {
        val state = State170_34.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State170_34.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State170_34.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State170_34.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State170_34.Error).message)
    }
}