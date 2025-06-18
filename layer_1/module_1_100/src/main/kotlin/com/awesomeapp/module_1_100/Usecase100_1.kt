package com.awesomeapp.module_1_100

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase100_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase100_1 UseCase")
    }
}