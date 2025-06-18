package com.awesomeapp.module_1_138

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase138_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase138_1 UseCase")
    }
}