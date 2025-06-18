package com.awesomeapp.module_1_119

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase119_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase119_1 UseCase")
    }
}