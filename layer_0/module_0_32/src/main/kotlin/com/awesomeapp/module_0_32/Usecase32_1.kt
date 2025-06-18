package com.awesomeapp.module_0_32

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase32_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase32_1 UseCase")
    }
}