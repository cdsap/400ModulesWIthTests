package com.awesomeapp.module_3_291

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase291_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase291_1 UseCase")
    }
}