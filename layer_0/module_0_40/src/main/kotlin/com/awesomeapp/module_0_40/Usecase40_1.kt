package com.awesomeapp.module_0_40

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase40_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase40_1 UseCase")
    }
}