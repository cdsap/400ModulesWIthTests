package com.awesomeapp.module_0_3

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase3_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase3_1 UseCase")
    }
}