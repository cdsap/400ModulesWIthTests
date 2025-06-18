package com.awesomeapp.module_4_336

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase336_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase336_1 UseCase")
    }
}