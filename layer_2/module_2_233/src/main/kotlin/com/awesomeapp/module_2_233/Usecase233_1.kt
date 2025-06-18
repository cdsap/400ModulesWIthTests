package com.awesomeapp.module_2_233

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase233_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase233_1 UseCase")
    }
}