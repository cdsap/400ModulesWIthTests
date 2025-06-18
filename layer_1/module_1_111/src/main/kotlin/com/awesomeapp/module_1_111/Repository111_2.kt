package com.awesomeapp.module_1_111

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository111_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository111_2 Repository"
    }
}