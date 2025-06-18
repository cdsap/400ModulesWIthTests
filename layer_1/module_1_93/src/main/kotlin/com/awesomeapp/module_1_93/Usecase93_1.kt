package com.awesomeapp.module_1_93

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase93_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase93_1 UseCase")
    }
}