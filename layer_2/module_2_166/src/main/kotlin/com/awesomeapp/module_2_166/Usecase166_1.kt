package com.awesomeapp.module_2_166

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase166_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase166_1 UseCase")
    }
}