package com.awesomeapp.module_0_46

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository46_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository46_2 Repository"
    }
}