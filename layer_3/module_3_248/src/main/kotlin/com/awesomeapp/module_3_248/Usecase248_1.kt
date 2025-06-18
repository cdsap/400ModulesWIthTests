package com.awesomeapp.module_3_248

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase248_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase248_1 UseCase")
    }
}