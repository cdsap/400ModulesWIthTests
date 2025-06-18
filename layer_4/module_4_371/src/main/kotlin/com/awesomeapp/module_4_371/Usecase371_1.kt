package com.awesomeapp.module_4_371

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase371_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase371_1 UseCase")
    }
}