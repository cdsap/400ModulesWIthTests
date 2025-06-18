package com.awesomeapp.module_0_27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api27_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api27_33 API"
    }
}