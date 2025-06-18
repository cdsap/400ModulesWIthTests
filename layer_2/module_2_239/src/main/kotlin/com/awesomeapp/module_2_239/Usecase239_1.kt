package com.awesomeapp.module_2_239

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase239_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase239_1 UseCase")
    }
}