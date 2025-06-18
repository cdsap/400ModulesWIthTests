package com.awesomeapp.module_3_246

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
import com.awesomeapp.module_3_246.*


@OptIn(ExperimentalCoroutinesApi::class)
class State246_124Test {
        @Test
    fun `test loading state`() {
        val state = State246_124.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State246_124.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State246_124.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State246_124.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State246_124.Error).message)
    }
}