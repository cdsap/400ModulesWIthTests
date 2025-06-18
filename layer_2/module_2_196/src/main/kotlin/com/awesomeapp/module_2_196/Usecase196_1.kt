package com.awesomeapp.module_2_196

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase196_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase196_1 UseCase")
    }
}