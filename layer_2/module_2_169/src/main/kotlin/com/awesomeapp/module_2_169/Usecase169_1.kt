package com.awesomeapp.module_2_169

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase169_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase169_1 UseCase")
    }
}