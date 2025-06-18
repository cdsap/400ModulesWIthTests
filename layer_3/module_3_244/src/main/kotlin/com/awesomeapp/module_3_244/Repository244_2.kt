package com.awesomeapp.module_3_244

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository244_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository244_2 Repository"
    }
}