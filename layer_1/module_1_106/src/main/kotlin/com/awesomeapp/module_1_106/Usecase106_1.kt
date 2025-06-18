package com.awesomeapp.module_1_106

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase106_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase106_1 UseCase")
    }
}