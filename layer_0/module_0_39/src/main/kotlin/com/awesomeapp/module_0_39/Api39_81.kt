package com.awesomeapp.module_0_39

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api39_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api39_81 API"
    }
}