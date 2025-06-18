package com.awesomeapp.module_0_28

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository28_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository28_2 Repository"
    }
}