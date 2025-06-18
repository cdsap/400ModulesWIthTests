package com.awesomeapp.module_0_25

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase25_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase25_1 UseCase")
    }
}