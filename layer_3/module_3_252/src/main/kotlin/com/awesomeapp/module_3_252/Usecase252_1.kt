package com.awesomeapp.module_3_252

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase252_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase252_1 UseCase")
    }
}