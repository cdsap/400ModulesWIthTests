package com.awesomeapp.module_3_315

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase315_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase315_1 UseCase")
    }
}