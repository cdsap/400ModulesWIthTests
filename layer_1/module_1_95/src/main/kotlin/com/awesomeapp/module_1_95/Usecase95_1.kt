package com.awesomeapp.module_1_95

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase95_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase95_1 UseCase")
    }
}