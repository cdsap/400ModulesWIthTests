package com.awesomeapp.module_1_149

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase149_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase149_1 UseCase")
    }
}