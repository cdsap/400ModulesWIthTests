package com.awesomeapp.module_4_355

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase355_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase355_1 UseCase")
    }
}