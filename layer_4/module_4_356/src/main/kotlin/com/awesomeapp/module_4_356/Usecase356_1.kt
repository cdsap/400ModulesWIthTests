package com.awesomeapp.module_4_356

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase356_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase356_1 UseCase")
    }
}