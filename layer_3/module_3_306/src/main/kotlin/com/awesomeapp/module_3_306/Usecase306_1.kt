package com.awesomeapp.module_3_306

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase306_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase306_1 UseCase")
    }
}