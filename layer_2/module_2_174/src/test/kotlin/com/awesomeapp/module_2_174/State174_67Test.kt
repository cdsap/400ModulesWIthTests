package com.awesomeapp.module_2_174

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
import com.awesomeapp.module_2_174.*


@OptIn(ExperimentalCoroutinesApi::class)
class State174_67Test {
        @Test
    fun `test loading state`() {
        val state = State174_67.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State174_67.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State174_67.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State174_67.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State174_67.Error).message)
    }
}