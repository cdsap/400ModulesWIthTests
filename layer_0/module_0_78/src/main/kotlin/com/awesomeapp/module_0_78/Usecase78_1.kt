package com.awesomeapp.module_0_78

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase78_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase78_1 UseCase")
    }
}