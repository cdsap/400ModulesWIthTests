package com.awesomeapp.module_2_176

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase176_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase176_1 UseCase")
    }
}