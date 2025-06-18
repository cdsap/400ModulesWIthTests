package com.awesomeapp.module_0_21

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase21_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase21_1 UseCase")
    }
}