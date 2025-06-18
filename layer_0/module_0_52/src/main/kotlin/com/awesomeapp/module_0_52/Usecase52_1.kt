package com.awesomeapp.module_0_52

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase52_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase52_1 UseCase")
    }
}