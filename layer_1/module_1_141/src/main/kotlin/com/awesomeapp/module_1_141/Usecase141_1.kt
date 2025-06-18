package com.awesomeapp.module_1_141

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase141_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase141_1 UseCase")
    }
}