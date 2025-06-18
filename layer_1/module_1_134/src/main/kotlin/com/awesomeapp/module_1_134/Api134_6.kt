package com.awesomeapp.module_1_134

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api134_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api134_6 API"
    }
}