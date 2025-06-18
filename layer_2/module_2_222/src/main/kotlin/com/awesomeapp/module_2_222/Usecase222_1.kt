package com.awesomeapp.module_2_222

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase222_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase222_1 UseCase")
    }
}