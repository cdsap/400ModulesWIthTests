package com.awesomeapp.module_4_346

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase346_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase346_1 UseCase")
    }
}