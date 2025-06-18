package com.awesomeapp.module_1_160

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase160_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase160_1 UseCase")
    }
}