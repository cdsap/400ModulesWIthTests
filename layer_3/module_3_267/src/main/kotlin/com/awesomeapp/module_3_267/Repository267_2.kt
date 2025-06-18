package com.awesomeapp.module_3_267

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository267_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository267_2 Repository"
    }
}