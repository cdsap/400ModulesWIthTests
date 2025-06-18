package com.awesomeapp.module_1_137

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase137_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase137_1 UseCase")
    }
}