package com.awesomeapp.module_4_396

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase396_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase396_1 UseCase")
    }
}