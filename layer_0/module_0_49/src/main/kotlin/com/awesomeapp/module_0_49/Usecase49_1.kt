package com.awesomeapp.module_0_49

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase49_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase49_1 UseCase")
    }
}