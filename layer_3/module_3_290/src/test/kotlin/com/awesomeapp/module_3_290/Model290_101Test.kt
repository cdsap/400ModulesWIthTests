package com.awesomeapp.module_3_290

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
import com.awesomeapp.module_3_290.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model290_101Test {
        @Test
    fun `test model creation`() {
        val model = Model290_101()
        assertNotNull(model)
    }
}