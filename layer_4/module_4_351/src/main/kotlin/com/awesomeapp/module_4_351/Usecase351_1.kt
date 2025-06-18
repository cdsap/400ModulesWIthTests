package com.awesomeapp.module_4_351

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase351_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase351_1 UseCase")
    }
}