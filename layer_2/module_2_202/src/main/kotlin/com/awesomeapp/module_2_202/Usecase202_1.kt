package com.awesomeapp.module_2_202

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase202_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase202_1 UseCase")
    }
}