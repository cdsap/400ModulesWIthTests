package com.awesomeapp.module_3_307

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase307_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase307_1 UseCase")
    }
}