package com.awesomeapp.module_3_287

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase287_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase287_1 UseCase")
    }
}