package com.awesomeapp.module_1_150

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase150_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase150_1 UseCase")
    }
}