package com.awesomeapp.module_2_232

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase232_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase232_1 UseCase")
    }
}