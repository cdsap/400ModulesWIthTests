package com.awesomeapp.module_4_372

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase372_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase372_1 UseCase")
    }
}