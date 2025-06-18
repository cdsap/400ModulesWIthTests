package com.awesomeapp.module_3_279

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
import com.awesomeapp.module_3_279.*


@OptIn(ExperimentalCoroutinesApi::class)
class State279_40Test {
        @Test
    fun `test loading state`() {
        val state = State279_40.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State279_40.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State279_40.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State279_40.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State279_40.Error).message)
    }
}