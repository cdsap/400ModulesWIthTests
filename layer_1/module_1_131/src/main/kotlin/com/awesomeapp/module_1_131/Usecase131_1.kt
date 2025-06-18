package com.awesomeapp.module_1_131

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase131_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase131_1 UseCase")
    }
}