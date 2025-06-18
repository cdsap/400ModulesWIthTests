package com.awesomeapp.module_2_236

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase236_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase236_1 UseCase")
    }
}