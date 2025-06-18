package com.awesomeapp.module_3_288

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase288_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase288_1 UseCase")
    }
}