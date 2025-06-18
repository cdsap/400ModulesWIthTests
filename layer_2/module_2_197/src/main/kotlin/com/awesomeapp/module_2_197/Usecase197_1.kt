package com.awesomeapp.module_2_197

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase197_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase197_1 UseCase")
    }
}