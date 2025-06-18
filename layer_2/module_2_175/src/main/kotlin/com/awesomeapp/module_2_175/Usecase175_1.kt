package com.awesomeapp.module_2_175

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase175_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase175_1 UseCase")
    }
}