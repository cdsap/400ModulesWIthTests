package com.awesomeapp.module_3_316

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase316_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase316_1 UseCase")
    }
}