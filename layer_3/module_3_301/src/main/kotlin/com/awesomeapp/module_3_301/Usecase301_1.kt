package com.awesomeapp.module_3_301

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase301_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase301_1 UseCase")
    }
}