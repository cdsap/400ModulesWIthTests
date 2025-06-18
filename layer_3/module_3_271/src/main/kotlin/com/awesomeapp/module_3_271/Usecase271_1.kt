package com.awesomeapp.module_3_271

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase271_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase271_1 UseCase")
    }
}