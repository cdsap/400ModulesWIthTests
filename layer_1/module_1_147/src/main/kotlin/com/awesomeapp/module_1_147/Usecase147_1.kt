package com.awesomeapp.module_1_147

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase147_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase147_1 UseCase")
    }
}