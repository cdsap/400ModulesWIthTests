package com.awesomeapp.module_2_178

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase178_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase178_1 UseCase")
    }
}