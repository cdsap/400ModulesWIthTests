package com.awesomeapp.module_1_140

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase140_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase140_1 UseCase")
    }
}