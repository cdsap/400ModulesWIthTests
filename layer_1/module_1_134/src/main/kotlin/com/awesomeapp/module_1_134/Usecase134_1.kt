package com.awesomeapp.module_1_134

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase134_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase134_1 UseCase")
    }
}