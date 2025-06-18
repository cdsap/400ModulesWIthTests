package com.awesomeapp.module_2_170

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase170_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase170_1 UseCase")
    }
}