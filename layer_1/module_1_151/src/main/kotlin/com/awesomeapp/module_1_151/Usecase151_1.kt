package com.awesomeapp.module_1_151

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase151_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase151_1 UseCase")
    }
}