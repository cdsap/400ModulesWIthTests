package com.awesomeapp.module_2_221

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase221_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase221_1 UseCase")
    }
}