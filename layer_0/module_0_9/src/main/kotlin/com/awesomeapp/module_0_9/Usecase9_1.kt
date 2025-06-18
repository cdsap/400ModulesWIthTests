package com.awesomeapp.module_0_9

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase9_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase9_1 UseCase")
    }
}