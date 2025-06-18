package com.awesomeapp.module_1_159

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase159_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase159_1 UseCase")
    }
}