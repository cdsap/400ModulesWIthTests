package com.awesomeapp.module_2_229

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository229_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository229_2 Repository"
    }
}