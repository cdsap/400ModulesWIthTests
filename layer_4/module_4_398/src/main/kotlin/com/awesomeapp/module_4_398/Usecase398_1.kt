package com.awesomeapp.module_4_398

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase398_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase398_1 UseCase")
    }
}