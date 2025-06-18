package com.awesomeapp.module_4_321

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository321_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository321_2 Repository"
    }
}