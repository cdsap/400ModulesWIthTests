package com.awesomeapp.module_0_12

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase12_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase12_1 UseCase")
    }
}