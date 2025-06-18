package com.awesomeapp.module_2_225

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase225_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase225_1 UseCase")
    }
}