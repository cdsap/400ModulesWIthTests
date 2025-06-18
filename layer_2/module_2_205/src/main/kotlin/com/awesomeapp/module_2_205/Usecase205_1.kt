package com.awesomeapp.module_2_205

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase205_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase205_1 UseCase")
    }
}