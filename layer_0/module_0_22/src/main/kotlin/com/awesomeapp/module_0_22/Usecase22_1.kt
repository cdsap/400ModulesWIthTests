package com.awesomeapp.module_0_22

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase22_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase22_1 UseCase")
    }
}