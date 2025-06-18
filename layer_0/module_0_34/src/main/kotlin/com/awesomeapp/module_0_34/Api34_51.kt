package com.awesomeapp.module_0_34

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api34_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api34_51 API"
    }
}