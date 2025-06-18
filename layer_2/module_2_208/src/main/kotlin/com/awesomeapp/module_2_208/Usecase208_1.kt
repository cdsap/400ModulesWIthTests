package com.awesomeapp.module_2_208

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase208_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase208_1 UseCase")
    }
}