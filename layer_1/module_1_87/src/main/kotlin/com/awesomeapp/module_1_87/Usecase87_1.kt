package com.awesomeapp.module_1_87

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase87_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase87_1 UseCase")
    }
}