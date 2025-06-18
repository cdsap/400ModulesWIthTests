package com.awesomeapp.module_4_366

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase366_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase366_1 UseCase")
    }
}