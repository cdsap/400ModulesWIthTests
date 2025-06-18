package com.awesomeapp.module_4_353

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase353_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase353_1 UseCase")
    }
}