package com.awesomeapp.module_1_90

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase90_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase90_1 UseCase")
    }
}