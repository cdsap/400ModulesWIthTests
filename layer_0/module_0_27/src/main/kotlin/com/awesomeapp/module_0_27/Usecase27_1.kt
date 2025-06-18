package com.awesomeapp.module_0_27

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase27_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase27_1 UseCase")
    }
}