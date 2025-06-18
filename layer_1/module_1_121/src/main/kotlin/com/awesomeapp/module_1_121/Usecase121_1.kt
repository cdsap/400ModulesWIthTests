package com.awesomeapp.module_1_121

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase121_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase121_1 UseCase")
    }
}