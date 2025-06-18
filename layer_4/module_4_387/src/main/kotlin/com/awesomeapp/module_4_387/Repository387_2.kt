package com.awesomeapp.module_4_387

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository387_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository387_2 Repository"
    }
}