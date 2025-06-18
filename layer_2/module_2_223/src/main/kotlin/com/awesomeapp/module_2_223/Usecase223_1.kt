package com.awesomeapp.module_2_223

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase223_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase223_1 UseCase")
    }
}