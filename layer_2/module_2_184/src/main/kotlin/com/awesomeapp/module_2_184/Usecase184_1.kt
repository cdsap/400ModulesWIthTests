package com.awesomeapp.module_2_184

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase184_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase184_1 UseCase")
    }
}