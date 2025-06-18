package com.awesomeapp.module_1_105

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase105_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase105_1 UseCase")
    }
}