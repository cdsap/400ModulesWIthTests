package com.awesomeapp.module_0_74

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository74_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository74_2 Repository"
    }
}