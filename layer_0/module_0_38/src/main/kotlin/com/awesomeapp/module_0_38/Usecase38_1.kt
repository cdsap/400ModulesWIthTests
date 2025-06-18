package com.awesomeapp.module_0_38

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase38_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase38_1 UseCase")
    }
}