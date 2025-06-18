package com.awesomeapp.module_4_368

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase368_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase368_1 UseCase")
    }
}