package com.awesomeapp.module_1_100

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
import com.awesomeapp.module_1_100.*


@OptIn(ExperimentalCoroutinesApi::class)
class State100_167Test {
        @Test
    fun `test loading state`() {
        val state = State100_167.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State100_167.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State100_167.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State100_167.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State100_167.Error).message)
    }
}