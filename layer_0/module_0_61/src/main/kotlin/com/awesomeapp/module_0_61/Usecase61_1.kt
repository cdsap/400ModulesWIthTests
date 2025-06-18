package com.awesomeapp.module_0_61

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase61_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase61_1 UseCase")
    }
}