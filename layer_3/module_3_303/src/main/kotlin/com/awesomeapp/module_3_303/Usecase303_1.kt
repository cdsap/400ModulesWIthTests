package com.awesomeapp.module_3_303

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase303_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase303_1 UseCase")
    }
}