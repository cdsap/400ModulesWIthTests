package com.awesomeapp.module_1_130

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository130_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository130_2 Repository"
    }
}