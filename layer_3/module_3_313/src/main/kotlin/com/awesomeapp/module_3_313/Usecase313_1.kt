package com.awesomeapp.module_3_313

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase313_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase313_1 UseCase")
    }
}