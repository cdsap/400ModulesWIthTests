package com.awesomeapp.module_2_203

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase203_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase203_1 UseCase")
    }
}