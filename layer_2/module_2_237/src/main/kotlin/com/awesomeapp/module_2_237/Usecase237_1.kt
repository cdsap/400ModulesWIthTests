package com.awesomeapp.module_2_237

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase237_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase237_1 UseCase")
    }
}