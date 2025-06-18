package com.awesomeapp.module_4_375

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase375_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase375_1 UseCase")
    }
}