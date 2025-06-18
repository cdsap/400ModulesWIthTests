package com.awesomeapp.module_4_356

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository356_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository356_2 Repository"
    }
}