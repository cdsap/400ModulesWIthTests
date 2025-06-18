package com.awesomeapp.module_3_255

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
import com.awesomeapp.module_3_255.*


@OptIn(ExperimentalCoroutinesApi::class)
class State255_127Test {
        @Test
    fun `test loading state`() {
        val state = State255_127.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State255_127.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State255_127.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State255_127.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State255_127.Error).message)
    }
}