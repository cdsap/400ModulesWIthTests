package com.awesomeapp.module_0_31

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase31_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase31_1 UseCase")
    }
}