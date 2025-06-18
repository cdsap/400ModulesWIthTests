package com.awesomeapp.module_3_242

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase242_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase242_1 UseCase")
    }
}