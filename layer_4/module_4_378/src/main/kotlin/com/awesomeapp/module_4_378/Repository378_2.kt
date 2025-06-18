package com.awesomeapp.module_4_378

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository378_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository378_2 Repository"
    }
}