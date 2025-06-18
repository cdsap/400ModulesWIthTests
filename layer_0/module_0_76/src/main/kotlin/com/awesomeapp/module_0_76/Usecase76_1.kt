package com.awesomeapp.module_0_76

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase76_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase76_1 UseCase")
    }
}