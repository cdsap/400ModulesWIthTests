package com.awesomeapp.module_0_19

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase19_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase19_1 UseCase")
    }
}