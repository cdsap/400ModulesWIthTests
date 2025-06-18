package com.awesomeapp.module_0_36

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase36_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase36_1 UseCase")
    }
}