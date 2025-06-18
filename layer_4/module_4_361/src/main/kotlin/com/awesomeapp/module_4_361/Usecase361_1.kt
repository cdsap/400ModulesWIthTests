package com.awesomeapp.module_4_361

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase361_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase361_1 UseCase")
    }
}