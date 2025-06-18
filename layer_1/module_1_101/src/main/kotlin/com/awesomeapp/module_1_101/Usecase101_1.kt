package com.awesomeapp.module_1_101

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase101_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase101_1 UseCase")
    }
}