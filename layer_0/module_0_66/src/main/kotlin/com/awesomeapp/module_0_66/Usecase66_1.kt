package com.awesomeapp.module_0_66

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase66_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase66_1 UseCase")
    }
}