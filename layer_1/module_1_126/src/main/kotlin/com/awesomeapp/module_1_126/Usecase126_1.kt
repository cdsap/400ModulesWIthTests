package com.awesomeapp.module_1_126

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase126_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase126_1 UseCase")
    }
}