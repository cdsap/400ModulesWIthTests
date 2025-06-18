package com.awesomeapp.module_3_292

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase292_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase292_1 UseCase")
    }
}