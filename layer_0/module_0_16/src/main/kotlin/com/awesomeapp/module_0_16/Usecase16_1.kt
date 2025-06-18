package com.awesomeapp.module_0_16

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase16_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase16_1 UseCase")
    }
}