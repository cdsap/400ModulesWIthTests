package com.awesomeapp.module_3_254

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase254_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase254_1 UseCase")
    }
}