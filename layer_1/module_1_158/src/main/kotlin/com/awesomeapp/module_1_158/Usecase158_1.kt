package com.awesomeapp.module_1_158

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase158_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase158_1 UseCase")
    }
}