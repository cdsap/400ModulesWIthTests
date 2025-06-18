package com.awesomeapp.module_1_111

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase111_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase111_1 UseCase")
    }
}