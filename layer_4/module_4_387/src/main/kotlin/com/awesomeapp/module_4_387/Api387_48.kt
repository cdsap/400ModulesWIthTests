package com.awesomeapp.module_4_387

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api387_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api387_48 API"
    }
}