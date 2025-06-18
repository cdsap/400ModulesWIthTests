package com.awesomeapp.module_4_329

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase329_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase329_1 UseCase")
    }
}