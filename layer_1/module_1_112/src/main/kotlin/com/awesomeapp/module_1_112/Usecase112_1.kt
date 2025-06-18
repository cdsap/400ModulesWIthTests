package com.awesomeapp.module_1_112

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase112_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase112_1 UseCase")
    }
}