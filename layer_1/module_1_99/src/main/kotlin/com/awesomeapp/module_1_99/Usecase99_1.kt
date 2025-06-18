package com.awesomeapp.module_1_99

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase99_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase99_1 UseCase")
    }
}