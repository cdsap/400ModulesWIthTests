package com.awesomeapp.module_0_26

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase26_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase26_1 UseCase")
    }
}