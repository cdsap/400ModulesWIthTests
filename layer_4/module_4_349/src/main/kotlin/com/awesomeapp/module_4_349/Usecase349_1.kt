package com.awesomeapp.module_4_349

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase349_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase349_1 UseCase")
    }
}