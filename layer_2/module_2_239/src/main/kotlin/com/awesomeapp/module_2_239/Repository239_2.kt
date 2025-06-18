package com.awesomeapp.module_2_239

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository239_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository239_2 Repository"
    }
}