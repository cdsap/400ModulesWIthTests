package com.awesomeapp.module_2_194

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase194_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase194_1 UseCase")
    }
}