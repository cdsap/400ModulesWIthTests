package com.awesomeapp.module_4_330

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase330_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase330_1 UseCase")
    }
}