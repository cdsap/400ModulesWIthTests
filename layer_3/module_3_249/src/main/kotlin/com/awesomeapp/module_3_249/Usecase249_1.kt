package com.awesomeapp.module_3_249

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase249_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase249_1 UseCase")
    }
}