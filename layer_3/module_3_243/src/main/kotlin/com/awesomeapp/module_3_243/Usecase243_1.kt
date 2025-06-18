package com.awesomeapp.module_3_243

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase243_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase243_1 UseCase")
    }
}