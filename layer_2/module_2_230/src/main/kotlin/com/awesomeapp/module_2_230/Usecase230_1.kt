package com.awesomeapp.module_2_230

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase230_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase230_1 UseCase")
    }
}