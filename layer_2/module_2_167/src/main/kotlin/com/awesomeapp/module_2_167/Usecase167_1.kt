package com.awesomeapp.module_2_167

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase167_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase167_1 UseCase")
    }
}