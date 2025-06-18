package com.awesomeapp.module_4_321

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase321_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase321_1 UseCase")
    }
}