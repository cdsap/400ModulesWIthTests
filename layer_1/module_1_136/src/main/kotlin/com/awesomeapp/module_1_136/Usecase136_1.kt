package com.awesomeapp.module_1_136

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase136_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase136_1 UseCase")
    }
}