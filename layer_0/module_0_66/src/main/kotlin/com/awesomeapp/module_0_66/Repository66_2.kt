package com.awesomeapp.module_0_66

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository66_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository66_2 Repository"
    }
}