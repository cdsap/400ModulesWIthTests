package com.awesomeapp.module_0_35

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase35_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase35_1 UseCase")
    }
}