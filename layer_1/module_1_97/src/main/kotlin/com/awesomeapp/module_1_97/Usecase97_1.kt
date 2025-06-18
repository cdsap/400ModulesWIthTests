package com.awesomeapp.module_1_97

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase97_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase97_1 UseCase")
    }
}