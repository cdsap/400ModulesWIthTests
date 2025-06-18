package com.awesomeapp.module_0_45

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase45_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase45_1 UseCase")
    }
}