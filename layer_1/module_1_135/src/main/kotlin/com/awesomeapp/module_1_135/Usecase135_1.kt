package com.awesomeapp.module_1_135

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase135_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase135_1 UseCase")
    }
}