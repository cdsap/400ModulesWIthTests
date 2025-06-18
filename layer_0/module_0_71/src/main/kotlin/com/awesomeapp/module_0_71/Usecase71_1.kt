package com.awesomeapp.module_0_71

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase71_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase71_1 UseCase")
    }
}