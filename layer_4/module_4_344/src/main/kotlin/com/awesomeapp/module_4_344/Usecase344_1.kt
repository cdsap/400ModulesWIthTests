package com.awesomeapp.module_4_344

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase344_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase344_1 UseCase")
    }
}