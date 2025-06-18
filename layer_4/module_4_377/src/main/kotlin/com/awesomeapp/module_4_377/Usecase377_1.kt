package com.awesomeapp.module_4_377

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase377_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase377_1 UseCase")
    }
}