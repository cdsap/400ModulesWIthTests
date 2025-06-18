package com.awesomeapp.module_3_280

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase280_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase280_1 UseCase")
    }
}