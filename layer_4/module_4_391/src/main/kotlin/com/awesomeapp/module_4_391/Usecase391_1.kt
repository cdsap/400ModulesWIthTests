package com.awesomeapp.module_4_391

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase391_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase391_1 UseCase")
    }
}