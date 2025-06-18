package com.awesomeapp.module_1_85

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository85_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository85_2 Repository"
    }
}