package com.awesomeapp.module_3_241

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase241_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase241_1 UseCase")
    }
}