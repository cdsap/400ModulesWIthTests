package com.awesomeapp.module_0_39

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api39_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api39_24 API"
    }
}