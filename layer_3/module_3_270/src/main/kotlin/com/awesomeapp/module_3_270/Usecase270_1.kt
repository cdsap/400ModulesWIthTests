package com.awesomeapp.module_3_270

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase270_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase270_1 UseCase")
    }
}