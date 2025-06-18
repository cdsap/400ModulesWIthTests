package com.awesomeapp.module_2_162

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase162_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase162_1 UseCase")
    }
}