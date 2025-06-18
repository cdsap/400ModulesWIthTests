package com.awesomeapp.module_1_89

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository89_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository89_2 Repository"
    }
}