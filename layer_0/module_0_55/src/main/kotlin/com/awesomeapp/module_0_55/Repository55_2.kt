package com.awesomeapp.module_0_55

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository55_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository55_2 Repository"
    }
}