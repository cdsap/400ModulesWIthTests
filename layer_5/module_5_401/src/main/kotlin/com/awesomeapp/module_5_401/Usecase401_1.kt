package com.awesomeapp.module_5_401

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase401_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase401_1 UseCase")
    }
}