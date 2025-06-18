package com.awesomeapp.module_3_262

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase262_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase262_1 UseCase")
    }
}