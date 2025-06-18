package com.awesomeapp.module_3_295

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase295_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase295_1 UseCase")
    }
}