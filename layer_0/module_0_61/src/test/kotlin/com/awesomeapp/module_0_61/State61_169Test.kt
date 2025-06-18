package com.awesomeapp.module_0_61

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
import com.awesomeapp.module_0_61.*


@OptIn(ExperimentalCoroutinesApi::class)
class State61_169Test {
        @Test
    fun `test loading state`() {
        val state = State61_169.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State61_169.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State61_169.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State61_169.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State61_169.Error).message)
    }
}