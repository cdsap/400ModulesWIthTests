package com.awesomeapp.module_4_369

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository369_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository369_2 Repository"
    }
}