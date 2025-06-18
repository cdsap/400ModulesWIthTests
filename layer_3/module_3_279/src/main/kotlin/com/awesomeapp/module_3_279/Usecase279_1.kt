package com.awesomeapp.module_3_279

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase279_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase279_1 UseCase")
    }
}