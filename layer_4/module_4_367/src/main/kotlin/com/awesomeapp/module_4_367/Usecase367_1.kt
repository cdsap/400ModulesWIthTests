package com.awesomeapp.module_4_367

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase367_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase367_1 UseCase")
    }
}