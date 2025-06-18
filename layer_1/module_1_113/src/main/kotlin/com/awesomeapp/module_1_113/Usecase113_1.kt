package com.awesomeapp.module_1_113

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase113_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase113_1 UseCase")
    }
}