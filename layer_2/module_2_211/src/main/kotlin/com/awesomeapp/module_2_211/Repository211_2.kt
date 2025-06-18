package com.awesomeapp.module_2_211

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository211_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository211_2 Repository"
    }
}