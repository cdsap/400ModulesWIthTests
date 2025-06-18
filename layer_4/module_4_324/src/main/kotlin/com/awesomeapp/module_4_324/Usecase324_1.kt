package com.awesomeapp.module_4_324

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase324_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase324_1 UseCase")
    }
}