package com.awesomeapp.module_2_188

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase188_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase188_1 UseCase")
    }
}