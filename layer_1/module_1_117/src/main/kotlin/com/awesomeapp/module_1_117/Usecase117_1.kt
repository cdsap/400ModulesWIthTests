package com.awesomeapp.module_1_117

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase117_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase117_1 UseCase")
    }
}