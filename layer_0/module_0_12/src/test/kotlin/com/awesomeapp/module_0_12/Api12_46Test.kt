package com.awesomeapp.module_0_12

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
import com.awesomeapp.module_0_12.*


@OptIn(ExperimentalCoroutinesApi::class)
class Api12_46Test {
        private lateinit var api: Api12_46

    @Before
    fun setup() {
        api = Api12_46()
    }

    @Test
    fun `test fetchData returns data`() = runTest {
        val result = api.fetchData()
        assertNotNull(result)
    }
}