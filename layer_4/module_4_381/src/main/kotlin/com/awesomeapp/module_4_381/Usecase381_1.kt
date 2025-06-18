package com.awesomeapp.module_4_381

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase381_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase381_1 UseCase")
    }
}