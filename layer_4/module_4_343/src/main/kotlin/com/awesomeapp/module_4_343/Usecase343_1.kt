package com.awesomeapp.module_4_343

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase343_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase343_1 UseCase")
    }
}