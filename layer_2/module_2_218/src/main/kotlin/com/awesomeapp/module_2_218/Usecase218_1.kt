package com.awesomeapp.module_2_218

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase218_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase218_1 UseCase")
    }
}