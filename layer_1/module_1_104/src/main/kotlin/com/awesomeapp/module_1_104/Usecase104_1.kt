package com.awesomeapp.module_1_104

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase104_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase104_1 UseCase")
    }
}