package com.awesomeapp.module_2_219

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase219_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase219_1 UseCase")
    }
}