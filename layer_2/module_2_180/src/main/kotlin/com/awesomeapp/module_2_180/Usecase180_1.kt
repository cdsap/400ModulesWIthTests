package com.awesomeapp.module_2_180

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase180_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase180_1 UseCase")
    }
}