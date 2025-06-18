package com.awesomeapp.module_2_171

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase171_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase171_1 UseCase")
    }
}