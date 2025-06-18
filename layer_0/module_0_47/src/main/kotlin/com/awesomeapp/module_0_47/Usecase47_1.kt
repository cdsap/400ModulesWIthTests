package com.awesomeapp.module_0_47

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase47_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase47_1 UseCase")
    }
}