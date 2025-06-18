package com.awesomeapp.module_0_65

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase65_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase65_1 UseCase")
    }
}