package com.awesomeapp.module_1_86

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase86_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase86_1 UseCase")
    }
}