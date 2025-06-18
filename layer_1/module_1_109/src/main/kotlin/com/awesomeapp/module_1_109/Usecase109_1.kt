package com.awesomeapp.module_1_109

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase109_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase109_1 UseCase")
    }
}