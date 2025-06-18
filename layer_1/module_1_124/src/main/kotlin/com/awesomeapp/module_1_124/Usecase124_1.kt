package com.awesomeapp.module_1_124

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase124_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase124_1 UseCase")
    }
}