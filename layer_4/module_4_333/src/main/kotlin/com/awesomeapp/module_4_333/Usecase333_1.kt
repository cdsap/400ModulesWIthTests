package com.awesomeapp.module_4_333

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase333_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase333_1 UseCase")
    }
}