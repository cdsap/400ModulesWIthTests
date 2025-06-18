package com.awesomeapp.module_0_56

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase56_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase56_1 UseCase")
    }
}