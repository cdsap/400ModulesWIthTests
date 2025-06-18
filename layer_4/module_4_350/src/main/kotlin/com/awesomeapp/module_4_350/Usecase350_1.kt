package com.awesomeapp.module_4_350

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase350_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase350_1 UseCase")
    }
}