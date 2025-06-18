package com.awesomeapp.module_4_399

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase399_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase399_1 UseCase")
    }
}