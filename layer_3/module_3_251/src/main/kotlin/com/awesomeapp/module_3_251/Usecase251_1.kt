package com.awesomeapp.module_3_251

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase251_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase251_1 UseCase")
    }
}