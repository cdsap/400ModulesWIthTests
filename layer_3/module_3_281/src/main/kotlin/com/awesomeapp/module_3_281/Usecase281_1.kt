package com.awesomeapp.module_3_281

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase281_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase281_1 UseCase")
    }
}