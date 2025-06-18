package com.awesomeapp.module_1_146

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase146_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase146_1 UseCase")
    }
}