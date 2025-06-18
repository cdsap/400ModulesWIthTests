package com.awesomeapp.module_3_283

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase283_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase283_1 UseCase")
    }
}