package com.awesomeapp.module_3_315

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository315_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository315_2 Repository"
    }
}