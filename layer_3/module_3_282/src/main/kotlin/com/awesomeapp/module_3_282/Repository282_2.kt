package com.awesomeapp.module_3_282

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository282_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository282_2 Repository"
    }
}