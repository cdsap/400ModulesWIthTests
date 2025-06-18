package com.awesomeapp.module_3_314

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase314_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase314_1 UseCase")
    }
}