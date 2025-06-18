package com.awesomeapp.module_3_297

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase297_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase297_1 UseCase")
    }
}