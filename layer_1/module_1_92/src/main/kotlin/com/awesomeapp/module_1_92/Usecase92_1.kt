package com.awesomeapp.module_1_92

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase92_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase92_1 UseCase")
    }
}