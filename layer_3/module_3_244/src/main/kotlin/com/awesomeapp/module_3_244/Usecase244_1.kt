package com.awesomeapp.module_3_244

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase244_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase244_1 UseCase")
    }
}