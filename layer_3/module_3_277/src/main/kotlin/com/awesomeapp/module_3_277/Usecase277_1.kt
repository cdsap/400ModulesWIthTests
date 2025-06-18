package com.awesomeapp.module_3_277

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase277_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase277_1 UseCase")
    }
}