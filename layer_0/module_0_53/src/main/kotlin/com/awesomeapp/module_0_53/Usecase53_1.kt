package com.awesomeapp.module_0_53

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase53_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase53_1 UseCase")
    }
}