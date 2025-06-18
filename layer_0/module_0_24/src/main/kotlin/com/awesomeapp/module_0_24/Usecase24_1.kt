package com.awesomeapp.module_0_24

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase24_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase24_1 UseCase")
    }
}