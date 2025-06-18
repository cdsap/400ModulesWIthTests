package com.awesomeapp.module_3_293

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase293_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase293_1 UseCase")
    }
}