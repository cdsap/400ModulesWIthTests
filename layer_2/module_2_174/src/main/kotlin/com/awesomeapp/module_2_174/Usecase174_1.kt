package com.awesomeapp.module_2_174

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase174_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase174_1 UseCase")
    }
}