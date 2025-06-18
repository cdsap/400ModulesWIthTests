package com.awesomeapp.module_4_386

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase386_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase386_1 UseCase")
    }
}