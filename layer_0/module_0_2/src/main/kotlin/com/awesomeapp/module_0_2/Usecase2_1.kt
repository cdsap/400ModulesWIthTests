package com.awesomeapp.module_0_2

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase2_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase2_1 UseCase")
    }
}