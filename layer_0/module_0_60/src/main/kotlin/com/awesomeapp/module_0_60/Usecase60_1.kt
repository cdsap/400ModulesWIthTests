package com.awesomeapp.module_0_60

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase60_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase60_1 UseCase")
    }
}