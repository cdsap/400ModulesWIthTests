package com.awesomeapp.module_0_10

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase10_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase10_1 UseCase")
    }
}