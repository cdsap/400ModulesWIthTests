package com.awesomeapp.module_4_388

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase388_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase388_1 UseCase")
    }
}