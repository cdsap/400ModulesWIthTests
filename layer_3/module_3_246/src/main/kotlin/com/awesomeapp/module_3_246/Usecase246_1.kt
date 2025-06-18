package com.awesomeapp.module_3_246

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase246_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase246_1 UseCase")
    }
}