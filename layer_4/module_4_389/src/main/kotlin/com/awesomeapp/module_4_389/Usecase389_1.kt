package com.awesomeapp.module_4_389

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase389_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase389_1 UseCase")
    }
}