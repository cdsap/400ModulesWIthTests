package com.awesomeapp.module_3_290

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase290_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase290_1 UseCase")
    }
}