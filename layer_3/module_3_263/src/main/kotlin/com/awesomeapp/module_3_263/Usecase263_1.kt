package com.awesomeapp.module_3_263

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase263_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase263_1 UseCase")
    }
}