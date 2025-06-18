package com.awesomeapp.module_0_78

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository78_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository78_2 Repository"
    }
}