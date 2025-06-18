package com.awesomeapp.module_0_33

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase33_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase33_1 UseCase")
    }
}