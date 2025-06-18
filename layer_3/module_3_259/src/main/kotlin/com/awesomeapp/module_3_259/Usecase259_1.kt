package com.awesomeapp.module_3_259

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase259_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase259_1 UseCase")
    }
}