package com.awesomeapp.module_3_285

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase285_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase285_1 UseCase")
    }
}