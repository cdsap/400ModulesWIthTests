package com.awesomeapp.module_0_58

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase58_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase58_1 UseCase")
    }
}