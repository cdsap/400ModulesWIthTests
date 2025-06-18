package com.awesomeapp.module_1_155

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase155_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase155_1 UseCase")
    }
}