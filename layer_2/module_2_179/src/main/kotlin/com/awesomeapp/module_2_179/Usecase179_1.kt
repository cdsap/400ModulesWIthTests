package com.awesomeapp.module_2_179

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase179_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase179_1 UseCase")
    }
}