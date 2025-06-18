package com.awesomeapp.module_4_374

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository374_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository374_2 Repository"
    }
}