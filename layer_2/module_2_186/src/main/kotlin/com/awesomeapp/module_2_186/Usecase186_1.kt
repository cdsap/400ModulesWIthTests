package com.awesomeapp.module_2_186

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase186_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase186_1 UseCase")
    }
}