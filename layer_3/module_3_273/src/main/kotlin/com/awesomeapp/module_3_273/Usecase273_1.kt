package com.awesomeapp.module_3_273

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase273_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase273_1 UseCase")
    }
}