package com.awesomeapp.module_0_70

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase70_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase70_1 UseCase")
    }
}