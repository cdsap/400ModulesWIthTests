package com.awesomeapp.module_0_27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository27_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository27_2 Repository"
    }
}