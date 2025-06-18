package com.awesomeapp.module_0_18

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase18_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase18_1 UseCase")
    }
}