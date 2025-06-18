package com.awesomeapp.module_0_77

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase77_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase77_1 UseCase")
    }
}