package com.awesomeapp.module_4_352

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase352_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase352_1 UseCase")
    }
}