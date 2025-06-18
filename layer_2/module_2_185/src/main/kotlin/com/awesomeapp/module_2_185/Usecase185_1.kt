package com.awesomeapp.module_2_185

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase185_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase185_1 UseCase")
    }
}