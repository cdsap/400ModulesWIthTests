package com.awesomeapp.module_0_53

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository53_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository53_2 Repository"
    }
}