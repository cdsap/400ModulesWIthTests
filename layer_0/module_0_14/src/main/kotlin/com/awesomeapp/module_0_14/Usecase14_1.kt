package com.awesomeapp.module_0_14

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase14_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase14_1 UseCase")
    }
}