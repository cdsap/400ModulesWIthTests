package com.awesomeapp.module_4_397

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase397_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase397_1 UseCase")
    }
}