package com.awesomeapp.module_3_257

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase257_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase257_1 UseCase")
    }
}