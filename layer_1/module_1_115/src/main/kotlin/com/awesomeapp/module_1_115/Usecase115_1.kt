package com.awesomeapp.module_1_115

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase115_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase115_1 UseCase")
    }
}