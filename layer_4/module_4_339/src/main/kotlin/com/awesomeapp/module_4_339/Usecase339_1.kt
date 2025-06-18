package com.awesomeapp.module_4_339

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase339_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase339_1 UseCase")
    }
}