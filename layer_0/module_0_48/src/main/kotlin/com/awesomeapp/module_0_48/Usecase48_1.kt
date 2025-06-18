package com.awesomeapp.module_0_48

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase48_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase48_1 UseCase")
    }
}