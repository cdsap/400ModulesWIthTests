package com.awesomeapp.module_4_347

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase347_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase347_1 UseCase")
    }
}