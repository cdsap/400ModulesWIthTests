package com.awesomeapp.module_2_169

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository169_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository169_2 Repository"
    }
}