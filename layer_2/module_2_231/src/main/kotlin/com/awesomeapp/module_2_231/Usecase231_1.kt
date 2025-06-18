package com.awesomeapp.module_2_231

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase231_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase231_1 UseCase")
    }
}