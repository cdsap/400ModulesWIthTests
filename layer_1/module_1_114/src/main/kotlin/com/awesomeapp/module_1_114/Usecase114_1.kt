package com.awesomeapp.module_1_114

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase114_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase114_1 UseCase")
    }
}