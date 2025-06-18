package com.awesomeapp.module_1_85

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase85_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase85_1 UseCase")
    }
}