package com.awesomeapp.module_4_387

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
import com.awesomeapp.module_4_387.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model387_23Test {
        @Test
    fun `test model creation`() {
        val model = Model387_23()
        assertNotNull(model)
    }
}