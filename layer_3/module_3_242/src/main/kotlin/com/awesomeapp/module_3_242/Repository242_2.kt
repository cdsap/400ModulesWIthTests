package com.awesomeapp.module_3_242

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository242_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository242_2 Repository"
    }
}