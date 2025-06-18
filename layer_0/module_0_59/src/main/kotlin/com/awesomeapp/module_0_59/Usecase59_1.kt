package com.awesomeapp.module_0_59

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase59_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase59_1 UseCase")
    }
}