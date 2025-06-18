package com.awesomeapp.module_3_312

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase312_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase312_1 UseCase")
    }
}