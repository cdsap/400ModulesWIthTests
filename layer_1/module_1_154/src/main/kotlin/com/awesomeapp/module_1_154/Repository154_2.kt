package com.awesomeapp.module_1_154

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository154_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository154_2 Repository"
    }
}