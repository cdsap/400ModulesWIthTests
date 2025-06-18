package com.awesomeapp.module_3_294

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase294_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase294_1 UseCase")
    }
}