package com.awesomeapp.module_3_319

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase319_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase319_1 UseCase")
    }
}