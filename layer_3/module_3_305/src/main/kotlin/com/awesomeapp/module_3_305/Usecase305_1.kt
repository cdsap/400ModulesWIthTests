package com.awesomeapp.module_3_305

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase305_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase305_1 UseCase")
    }
}