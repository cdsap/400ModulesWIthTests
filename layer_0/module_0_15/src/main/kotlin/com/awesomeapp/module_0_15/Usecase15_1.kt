package com.awesomeapp.module_0_15

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase15_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase15_1 UseCase")
    }
}