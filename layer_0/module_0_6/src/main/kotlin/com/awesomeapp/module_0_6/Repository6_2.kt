package com.awesomeapp.module_0_6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository6_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository6_2 Repository"
    }
}