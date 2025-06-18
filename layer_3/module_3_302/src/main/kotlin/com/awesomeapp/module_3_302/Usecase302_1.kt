package com.awesomeapp.module_3_302

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase302_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase302_1 UseCase")
    }
}