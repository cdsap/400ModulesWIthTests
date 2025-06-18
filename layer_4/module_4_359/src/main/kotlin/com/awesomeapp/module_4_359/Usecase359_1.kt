package com.awesomeapp.module_4_359

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase359_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase359_1 UseCase")
    }
}