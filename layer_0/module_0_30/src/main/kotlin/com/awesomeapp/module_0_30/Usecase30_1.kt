package com.awesomeapp.module_0_30

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase30_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase30_1 UseCase")
    }
}