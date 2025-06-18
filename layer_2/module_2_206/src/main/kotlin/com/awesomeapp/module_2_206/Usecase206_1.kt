package com.awesomeapp.module_2_206

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase206_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase206_1 UseCase")
    }
}