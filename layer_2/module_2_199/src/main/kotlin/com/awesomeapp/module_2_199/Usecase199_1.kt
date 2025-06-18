package com.awesomeapp.module_2_199

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase199_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase199_1 UseCase")
    }
}