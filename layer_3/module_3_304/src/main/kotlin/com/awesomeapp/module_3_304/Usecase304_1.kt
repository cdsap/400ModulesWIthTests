package com.awesomeapp.module_3_304

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase304_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase304_1 UseCase")
    }
}