package com.awesomeapp.module_2_172

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase172_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase172_1 UseCase")
    }
}