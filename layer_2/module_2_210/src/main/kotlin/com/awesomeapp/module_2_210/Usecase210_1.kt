package com.awesomeapp.module_2_210

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase210_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase210_1 UseCase")
    }
}