package com.awesomeapp.module_2_165

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase165_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase165_1 UseCase")
    }
}