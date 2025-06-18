package com.awesomeapp.module_1_134

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api134_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api134_51 API"
    }
}