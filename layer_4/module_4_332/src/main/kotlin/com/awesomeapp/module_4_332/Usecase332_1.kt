package com.awesomeapp.module_4_332

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase332_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase332_1 UseCase")
    }
}