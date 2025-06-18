package com.awesomeapp.module_0_67

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api67_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api67_87 API"
    }
}