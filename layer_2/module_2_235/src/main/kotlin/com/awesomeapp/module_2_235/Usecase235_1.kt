package com.awesomeapp.module_2_235

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase235_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase235_1 UseCase")
    }
}