package com.awesomeapp.module_3_267

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase267_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase267_1 UseCase")
    }
}