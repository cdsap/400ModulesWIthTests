package com.awesomeapp.module_4_379

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase379_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase379_1 UseCase")
    }
}