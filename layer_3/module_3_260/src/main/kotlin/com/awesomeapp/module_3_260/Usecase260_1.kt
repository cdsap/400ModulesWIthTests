package com.awesomeapp.module_3_260

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase260_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase260_1 UseCase")
    }
}