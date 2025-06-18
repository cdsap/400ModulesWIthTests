package com.awesomeapp.module_4_385

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase385_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase385_1 UseCase")
    }
}