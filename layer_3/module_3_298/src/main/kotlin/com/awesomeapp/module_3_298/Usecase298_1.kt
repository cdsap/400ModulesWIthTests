package com.awesomeapp.module_3_298

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase298_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase298_1 UseCase")
    }
}