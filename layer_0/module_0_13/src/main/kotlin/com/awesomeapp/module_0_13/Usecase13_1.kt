package com.awesomeapp.module_0_13

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase13_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase13_1 UseCase")
    }
}