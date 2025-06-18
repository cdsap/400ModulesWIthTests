package com.awesomeapp.module_0_44

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase44_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase44_1 UseCase")
    }
}