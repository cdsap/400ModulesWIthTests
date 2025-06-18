package com.awesomeapp.module_3_288

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository288_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository288_2 Repository"
    }
}