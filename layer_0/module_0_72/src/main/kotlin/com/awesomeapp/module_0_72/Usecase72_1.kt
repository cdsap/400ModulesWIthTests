package com.awesomeapp.module_0_72

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase72_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase72_1 UseCase")
    }
}