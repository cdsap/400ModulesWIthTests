package com.awesomeapp.module_3_253

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase253_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase253_1 UseCase")
    }
}