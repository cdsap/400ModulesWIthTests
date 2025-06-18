package com.awesomeapp.module_3_289

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase289_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase289_1 UseCase")
    }
}