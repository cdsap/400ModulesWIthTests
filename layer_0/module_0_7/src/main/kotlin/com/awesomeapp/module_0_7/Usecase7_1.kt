package com.awesomeapp.module_0_7

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase7_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase7_1 UseCase")
    }
}