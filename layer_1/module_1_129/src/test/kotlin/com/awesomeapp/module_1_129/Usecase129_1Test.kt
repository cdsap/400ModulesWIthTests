package com.awesomeapp.module_1_129

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
import com.awesomeapp.module_1_129.*
import kotlinx.coroutines.flow.first


@OptIn(ExperimentalCoroutinesApi::class)
class Usecase129_1Test {
        private lateinit var useCase: Usecase129_1

    @Before
    fun setup() {
        useCase = Usecase129_1()
    }

    @Test
    fun `test invoke returns data`() = runTest {
        val result = useCase().first()
        assertEquals("Data from Usecase129_1 UseCase", result)
    }
}