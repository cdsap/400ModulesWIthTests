package com.awesomeapp.module_1_120

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase120_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase120_1 UseCase")
    }
}