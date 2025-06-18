package com.awesomeapp.module_4_328

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase328_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase328_1 UseCase")
    }
}