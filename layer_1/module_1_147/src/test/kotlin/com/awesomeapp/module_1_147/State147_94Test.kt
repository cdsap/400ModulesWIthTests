package com.awesomeapp.module_1_147

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
import com.awesomeapp.module_1_147.*


@OptIn(ExperimentalCoroutinesApi::class)
class State147_94Test {
        @Test
    fun `test loading state`() {
        val state = State147_94.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State147_94.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State147_94.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State147_94.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State147_94.Error).message)
    }
}