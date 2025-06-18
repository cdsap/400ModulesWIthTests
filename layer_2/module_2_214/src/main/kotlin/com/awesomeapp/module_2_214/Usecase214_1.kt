package com.awesomeapp.module_2_214

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase214_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase214_1 UseCase")
    }
}