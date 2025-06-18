package com.awesomeapp.module_0_73

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase73_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase73_1 UseCase")
    }
}