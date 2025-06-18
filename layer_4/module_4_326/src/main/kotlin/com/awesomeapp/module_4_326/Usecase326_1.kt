package com.awesomeapp.module_4_326

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase326_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase326_1 UseCase")
    }
}