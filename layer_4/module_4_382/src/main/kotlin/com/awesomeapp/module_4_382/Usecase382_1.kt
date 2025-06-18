package com.awesomeapp.module_4_382

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase382_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase382_1 UseCase")
    }
}