package com.awesomeapp.module_0_39

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase39_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase39_1 UseCase")
    }
}