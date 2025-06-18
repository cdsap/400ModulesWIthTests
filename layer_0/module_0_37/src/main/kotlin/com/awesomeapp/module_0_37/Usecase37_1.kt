package com.awesomeapp.module_0_37

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase37_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase37_1 UseCase")
    }
}