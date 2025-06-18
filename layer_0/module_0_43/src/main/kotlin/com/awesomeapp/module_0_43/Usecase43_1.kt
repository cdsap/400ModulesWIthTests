package com.awesomeapp.module_0_43

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase43_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase43_1 UseCase")
    }
}