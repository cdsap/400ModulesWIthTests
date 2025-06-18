package com.awesomeapp.module_3_266

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase266_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase266_1 UseCase")
    }
}