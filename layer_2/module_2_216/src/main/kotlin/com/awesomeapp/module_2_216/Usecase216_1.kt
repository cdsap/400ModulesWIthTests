package com.awesomeapp.module_2_216

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase216_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase216_1 UseCase")
    }
}