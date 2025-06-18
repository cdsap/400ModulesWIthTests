package com.awesomeapp.module_2_166

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository166_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository166_2 Repository"
    }
}