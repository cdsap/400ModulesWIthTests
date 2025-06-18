package com.awesomeapp.module_2_238

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase238_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase238_1 UseCase")
    }
}