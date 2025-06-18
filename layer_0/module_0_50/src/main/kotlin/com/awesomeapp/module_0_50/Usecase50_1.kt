package com.awesomeapp.module_0_50

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase50_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase50_1 UseCase")
    }
}