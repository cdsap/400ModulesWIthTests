package com.awesomeapp.module_2_213

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase213_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase213_1 UseCase")
    }
}