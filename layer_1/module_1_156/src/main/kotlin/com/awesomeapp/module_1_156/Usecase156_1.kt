package com.awesomeapp.module_1_156

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase156_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase156_1 UseCase")
    }
}