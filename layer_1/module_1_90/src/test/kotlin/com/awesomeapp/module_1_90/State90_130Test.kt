package com.awesomeapp.module_1_90

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
import com.awesomeapp.module_1_90.*


@OptIn(ExperimentalCoroutinesApi::class)
class State90_130Test {
        @Test
    fun `test loading state`() {
        val state = State90_130.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State90_130.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State90_130.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State90_130.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State90_130.Error).message)
    }
}