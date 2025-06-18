package com.awesomeapp.module_2_199

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository199_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository199_2 Repository"
    }
}