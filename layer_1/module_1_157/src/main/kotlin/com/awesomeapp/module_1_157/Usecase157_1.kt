package com.awesomeapp.module_1_157

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase157_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase157_1 UseCase")
    }
}