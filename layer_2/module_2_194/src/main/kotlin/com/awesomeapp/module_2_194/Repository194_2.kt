package com.awesomeapp.module_2_194

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository194_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository194_2 Repository"
    }
}