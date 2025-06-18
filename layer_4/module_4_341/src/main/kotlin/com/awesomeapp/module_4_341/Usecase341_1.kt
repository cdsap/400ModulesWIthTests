package com.awesomeapp.module_4_341

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase341_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase341_1 UseCase")
    }
}