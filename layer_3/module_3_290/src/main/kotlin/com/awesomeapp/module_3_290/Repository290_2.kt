package com.awesomeapp.module_3_290

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository290_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository290_2 Repository"
    }
}