package com.awesomeapp.module_4_363

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase363_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase363_1 UseCase")
    }
}