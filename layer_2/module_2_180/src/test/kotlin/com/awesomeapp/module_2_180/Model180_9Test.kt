package com.awesomeapp.module_2_180

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
import com.awesomeapp.module_2_180.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model180_9Test {
        @Test
    fun `test model creation`() {
        val model = Model180_9()
        assertNotNull(model)
    }
}