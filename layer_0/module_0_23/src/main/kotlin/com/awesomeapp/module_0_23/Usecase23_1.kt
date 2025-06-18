package com.awesomeapp.module_0_23

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase23_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase23_1 UseCase")
    }
}