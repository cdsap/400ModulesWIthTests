package com.awesomeapp.module_1_116

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase116_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase116_1 UseCase")
    }
}