package com.awesomeapp.module_3_258

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository258_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository258_2 Repository"
    }
}