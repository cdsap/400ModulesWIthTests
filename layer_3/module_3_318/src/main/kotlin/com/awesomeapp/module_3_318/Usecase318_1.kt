package com.awesomeapp.module_3_318

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase318_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase318_1 UseCase")
    }
}