package com.awesomeapp.module_0_28

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase28_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase28_1 UseCase")
    }
}