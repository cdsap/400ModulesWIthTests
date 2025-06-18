package com.awesomeapp.module_2_191

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase191_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase191_1 UseCase")
    }
}