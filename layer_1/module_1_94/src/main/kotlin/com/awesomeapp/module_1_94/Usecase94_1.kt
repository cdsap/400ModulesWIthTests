package com.awesomeapp.module_1_94

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase94_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase94_1 UseCase")
    }
}