package com.awesomeapp.module_4_392

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase392_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase392_1 UseCase")
    }
}