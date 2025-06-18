package com.awesomeapp.module_4_337

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase337_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase337_1 UseCase")
    }
}