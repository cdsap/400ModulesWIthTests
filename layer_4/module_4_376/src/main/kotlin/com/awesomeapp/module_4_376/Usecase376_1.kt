package com.awesomeapp.module_4_376

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase376_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase376_1 UseCase")
    }
}