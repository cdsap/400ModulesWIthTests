package com.awesomeapp.module_1_139

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository139_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository139_2 Repository"
    }
}