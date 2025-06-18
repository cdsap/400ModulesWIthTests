package com.awesomeapp.module_2_209

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase209_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase209_1 UseCase")
    }
}