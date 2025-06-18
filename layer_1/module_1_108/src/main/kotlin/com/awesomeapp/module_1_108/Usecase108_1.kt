package com.awesomeapp.module_1_108

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase108_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase108_1 UseCase")
    }
}