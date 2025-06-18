package com.awesomeapp.module_2_201

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase201_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase201_1 UseCase")
    }
}