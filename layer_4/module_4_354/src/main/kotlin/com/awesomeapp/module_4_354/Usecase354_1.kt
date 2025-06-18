package com.awesomeapp.module_4_354

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase354_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase354_1 UseCase")
    }
}