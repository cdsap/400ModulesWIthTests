package com.awesomeapp.module_3_256

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase256_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase256_1 UseCase")
    }
}