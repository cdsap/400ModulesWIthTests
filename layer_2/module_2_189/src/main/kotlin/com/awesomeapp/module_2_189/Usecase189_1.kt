package com.awesomeapp.module_2_189

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase189_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase189_1 UseCase")
    }
}