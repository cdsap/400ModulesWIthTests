package com.awesomeapp.module_2_173

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository173_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository173_2 Repository"
    }
}