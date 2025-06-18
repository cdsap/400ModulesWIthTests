package com.awesomeapp.module_2_226

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase226_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase226_1 UseCase")
    }
}