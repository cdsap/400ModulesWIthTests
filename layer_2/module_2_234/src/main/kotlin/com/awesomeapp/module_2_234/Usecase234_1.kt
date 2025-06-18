package com.awesomeapp.module_2_234

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase234_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase234_1 UseCase")
    }
}