package com.awesomeapp.module_4_345

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase345_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase345_1 UseCase")
    }
}