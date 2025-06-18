package com.awesomeapp.module_2_161

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase161_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase161_1 UseCase")
    }
}