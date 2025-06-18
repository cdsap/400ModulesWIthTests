package com.awesomeapp.module_1_102

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase102_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase102_1 UseCase")
    }
}