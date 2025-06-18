package com.awesomeapp.module_4_393

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase393_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase393_1 UseCase")
    }
}