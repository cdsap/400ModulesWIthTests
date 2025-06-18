package com.awesomeapp.module_2_168

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase168_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase168_1 UseCase")
    }
}