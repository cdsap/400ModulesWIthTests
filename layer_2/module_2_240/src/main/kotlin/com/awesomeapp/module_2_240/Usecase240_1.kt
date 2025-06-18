package com.awesomeapp.module_2_240

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase240_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase240_1 UseCase")
    }
}