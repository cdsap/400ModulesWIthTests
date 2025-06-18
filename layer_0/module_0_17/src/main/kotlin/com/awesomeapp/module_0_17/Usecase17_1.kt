package com.awesomeapp.module_0_17

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase17_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase17_1 UseCase")
    }
}