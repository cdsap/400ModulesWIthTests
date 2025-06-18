package com.awesomeapp.module_3_258

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase258_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase258_1 UseCase")
    }
}