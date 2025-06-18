package com.awesomeapp.module_0_20

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase20_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase20_1 UseCase")
    }
}