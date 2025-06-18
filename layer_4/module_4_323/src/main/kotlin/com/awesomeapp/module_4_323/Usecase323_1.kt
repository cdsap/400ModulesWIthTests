package com.awesomeapp.module_4_323

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase323_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase323_1 UseCase")
    }
}