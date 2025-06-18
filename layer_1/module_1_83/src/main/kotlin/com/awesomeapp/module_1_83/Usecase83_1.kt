package com.awesomeapp.module_1_83

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase83_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase83_1 UseCase")
    }
}