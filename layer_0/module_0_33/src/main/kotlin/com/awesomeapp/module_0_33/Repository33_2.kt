package com.awesomeapp.module_0_33

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository33_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository33_2 Repository"
    }
}