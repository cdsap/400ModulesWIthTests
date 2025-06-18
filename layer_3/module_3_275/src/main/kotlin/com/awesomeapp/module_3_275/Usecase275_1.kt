package com.awesomeapp.module_3_275

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase275_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase275_1 UseCase")
    }
}