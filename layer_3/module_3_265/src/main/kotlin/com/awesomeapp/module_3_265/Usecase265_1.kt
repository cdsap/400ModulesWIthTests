package com.awesomeapp.module_3_265

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase265_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase265_1 UseCase")
    }
}