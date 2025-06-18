package com.awesomeapp.module_2_201

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api201_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api201_51 API"
    }
}