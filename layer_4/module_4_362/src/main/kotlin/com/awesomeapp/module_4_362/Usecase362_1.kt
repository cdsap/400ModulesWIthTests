package com.awesomeapp.module_4_362

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase362_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase362_1 UseCase")
    }
}