package com.awesomeapp.module_0_46

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase46_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase46_1 UseCase")
    }
}