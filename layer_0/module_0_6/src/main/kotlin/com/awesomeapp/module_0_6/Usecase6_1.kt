package com.awesomeapp.module_0_6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase6_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase6_1 UseCase")
    }
}