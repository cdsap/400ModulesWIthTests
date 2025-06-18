package com.awesomeapp.module_4_374

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase374_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase374_1 UseCase")
    }
}