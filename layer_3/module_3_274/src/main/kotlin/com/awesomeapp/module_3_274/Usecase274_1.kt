package com.awesomeapp.module_3_274

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase274_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase274_1 UseCase")
    }
}