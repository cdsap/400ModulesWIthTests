package com.awesomeapp.module_2_173

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase173_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase173_1 UseCase")
    }
}