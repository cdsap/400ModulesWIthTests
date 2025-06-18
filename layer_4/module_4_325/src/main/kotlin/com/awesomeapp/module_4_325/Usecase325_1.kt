package com.awesomeapp.module_4_325

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase325_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase325_1 UseCase")
    }
}