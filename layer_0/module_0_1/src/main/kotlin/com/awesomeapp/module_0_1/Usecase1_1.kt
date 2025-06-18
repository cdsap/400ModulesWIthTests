package com.awesomeapp.module_0_1

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase1_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1_1 UseCase")
    }
}