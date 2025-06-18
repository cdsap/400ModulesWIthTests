package com.awesomeapp.module_0_58

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository58_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository58_2 Repository"
    }
}