package com.awesomeapp.module_2_181

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase181_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase181_1 UseCase")
    }
}