package com.awesomeapp.module_3_255

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase255_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase255_1 UseCase")
    }
}