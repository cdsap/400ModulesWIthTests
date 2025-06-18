package com.awesomeapp.module_2_227

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase227_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase227_1 UseCase")
    }
}