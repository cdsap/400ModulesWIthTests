package com.awesomeapp.module_1_153

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase153_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase153_1 UseCase")
    }
}