package com.awesomeapp.module_3_310

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase310_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase310_1 UseCase")
    }
}