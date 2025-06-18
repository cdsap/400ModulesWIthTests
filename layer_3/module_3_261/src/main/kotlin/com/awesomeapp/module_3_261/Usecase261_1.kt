package com.awesomeapp.module_3_261

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase261_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase261_1 UseCase")
    }
}