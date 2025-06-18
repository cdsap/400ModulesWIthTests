package com.awesomeapp.module_3_317

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase317_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase317_1 UseCase")
    }
}