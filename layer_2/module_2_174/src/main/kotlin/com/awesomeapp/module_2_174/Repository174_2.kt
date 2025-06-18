package com.awesomeapp.module_2_174

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository174_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository174_2 Repository"
    }
}