package com.awesomeapp.module_1_152

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase152_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase152_1 UseCase")
    }
}