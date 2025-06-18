package com.awesomeapp.module_1_91

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase91_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase91_1 UseCase")
    }
}