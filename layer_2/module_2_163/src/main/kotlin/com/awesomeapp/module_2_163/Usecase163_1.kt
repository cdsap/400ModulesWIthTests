package com.awesomeapp.module_2_163

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase163_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase163_1 UseCase")
    }
}