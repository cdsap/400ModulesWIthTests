package com.awesomeapp.module_0_5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase5_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase5_1 UseCase")
    }
}