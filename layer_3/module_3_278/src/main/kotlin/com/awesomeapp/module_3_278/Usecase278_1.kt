package com.awesomeapp.module_3_278

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase278_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase278_1 UseCase")
    }
}