package com.awesomeapp.module_1_88

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase88_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase88_1 UseCase")
    }
}