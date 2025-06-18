package com.awesomeapp.module_3_247

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase247_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase247_1 UseCase")
    }
}