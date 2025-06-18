package com.awesomeapp.module_3_309

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase309_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase309_1 UseCase")
    }
}