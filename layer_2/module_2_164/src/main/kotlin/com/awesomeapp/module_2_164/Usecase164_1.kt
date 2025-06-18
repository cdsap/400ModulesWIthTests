package com.awesomeapp.module_2_164

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase164_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase164_1 UseCase")
    }
}