package com.awesomeapp.module_4_370

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase370_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase370_1 UseCase")
    }
}