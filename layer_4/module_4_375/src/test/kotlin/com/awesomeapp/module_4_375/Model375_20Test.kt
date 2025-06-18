package com.awesomeapp.module_4_375

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
import com.awesomeapp.module_4_375.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model375_20Test {
        @Test
    fun `test model creation`() {
        val model = Model375_20()
        assertNotNull(model)
    }
}