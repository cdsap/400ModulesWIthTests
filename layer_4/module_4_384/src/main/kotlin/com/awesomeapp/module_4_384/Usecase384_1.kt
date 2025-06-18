package com.awesomeapp.module_4_384

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase384_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase384_1 UseCase")
    }
}