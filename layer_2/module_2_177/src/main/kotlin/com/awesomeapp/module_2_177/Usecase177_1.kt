package com.awesomeapp.module_2_177

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase177_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase177_1 UseCase")
    }
}