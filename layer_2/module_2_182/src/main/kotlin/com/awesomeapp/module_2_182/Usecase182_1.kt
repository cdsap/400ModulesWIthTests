package com.awesomeapp.module_2_182

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase182_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase182_1 UseCase")
    }
}