package com.awesomeapp.module_2_190

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase190_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase190_1 UseCase")
    }
}