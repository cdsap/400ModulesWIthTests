package com.awesomeapp.module_3_308

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase308_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase308_1 UseCase")
    }
}