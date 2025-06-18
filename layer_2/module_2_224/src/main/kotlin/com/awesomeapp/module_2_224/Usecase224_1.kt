package com.awesomeapp.module_2_224

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase224_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase224_1 UseCase")
    }
}