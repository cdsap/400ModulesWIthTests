package com.awesomeapp.module_2_187

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase187_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase187_1 UseCase")
    }
}