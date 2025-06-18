package com.awesomeapp.module_4_400

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase400_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase400_1 UseCase")
    }
}