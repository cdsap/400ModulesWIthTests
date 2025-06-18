package com.awesomeapp.module_2_215

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase215_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase215_1 UseCase")
    }
}