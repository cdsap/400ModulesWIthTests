package com.awesomeapp.module_1_103

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase103_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase103_1 UseCase")
    }
}