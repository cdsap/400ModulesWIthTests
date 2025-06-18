package com.awesomeapp.module_1_81

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase81_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase81_1 UseCase")
    }
}