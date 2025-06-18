package com.awesomeapp.module_1_133

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase133_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase133_1 UseCase")
    }
}