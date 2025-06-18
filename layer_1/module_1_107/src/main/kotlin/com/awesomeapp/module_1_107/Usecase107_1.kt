package com.awesomeapp.module_1_107

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase107_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase107_1 UseCase")
    }
}