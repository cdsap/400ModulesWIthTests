package com.awesomeapp.module_1_103

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
import com.awesomeapp.module_1_103.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model103_101Test {
        @Test
    fun `test model creation`() {
        val model = Model103_101()
        assertNotNull(model)
    }
}