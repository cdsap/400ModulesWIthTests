package com.awesomeapp.module_1_132

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase132_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase132_1 UseCase")
    }
}