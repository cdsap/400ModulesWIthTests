package com.awesomeapp.module_3_300

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase300_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase300_1 UseCase")
    }
}