package com.awesomeapp.module_2_220

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase220_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase220_1 UseCase")
    }
}