package com.awesomeapp.module_3_299

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase299_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase299_1 UseCase")
    }
}