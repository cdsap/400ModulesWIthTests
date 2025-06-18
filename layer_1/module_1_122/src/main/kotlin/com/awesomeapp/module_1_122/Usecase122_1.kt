package com.awesomeapp.module_1_122

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase122_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase122_1 UseCase")
    }
}