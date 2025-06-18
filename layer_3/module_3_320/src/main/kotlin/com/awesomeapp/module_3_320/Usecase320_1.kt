package com.awesomeapp.module_3_320

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase320_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase320_1 UseCase")
    }
}