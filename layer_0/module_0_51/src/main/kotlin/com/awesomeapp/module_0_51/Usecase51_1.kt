package com.awesomeapp.module_0_51

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase51_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase51_1 UseCase")
    }
}