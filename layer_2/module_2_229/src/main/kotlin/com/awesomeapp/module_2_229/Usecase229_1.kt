package com.awesomeapp.module_2_229

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase229_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase229_1 UseCase")
    }
}