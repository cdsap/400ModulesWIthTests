package com.awesomeapp.module_4_322

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase322_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase322_1 UseCase")
    }
}