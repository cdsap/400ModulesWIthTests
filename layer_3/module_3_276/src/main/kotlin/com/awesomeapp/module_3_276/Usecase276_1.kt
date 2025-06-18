package com.awesomeapp.module_3_276

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase276_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase276_1 UseCase")
    }
}