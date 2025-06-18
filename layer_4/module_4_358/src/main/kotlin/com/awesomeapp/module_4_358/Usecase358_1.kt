package com.awesomeapp.module_4_358

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase358_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase358_1 UseCase")
    }
}