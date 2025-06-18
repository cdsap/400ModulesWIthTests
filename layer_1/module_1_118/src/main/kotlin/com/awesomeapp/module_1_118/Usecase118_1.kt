package com.awesomeapp.module_1_118

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase118_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase118_1 UseCase")
    }
}