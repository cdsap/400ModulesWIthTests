package com.awesomeapp.module_0_64

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase64_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase64_1 UseCase")
    }
}