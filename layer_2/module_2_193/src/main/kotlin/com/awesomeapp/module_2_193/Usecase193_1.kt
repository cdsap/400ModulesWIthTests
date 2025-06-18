package com.awesomeapp.module_2_193

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase193_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase193_1 UseCase")
    }
}