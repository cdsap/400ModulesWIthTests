package com.awesomeapp.module_0_31

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository31_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository31_2 Repository"
    }
}