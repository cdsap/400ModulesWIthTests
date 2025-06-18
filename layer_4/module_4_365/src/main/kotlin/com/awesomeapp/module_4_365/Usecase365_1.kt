package com.awesomeapp.module_4_365

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase365_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase365_1 UseCase")
    }
}