package com.awesomeapp.module_1_148

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase148_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase148_1 UseCase")
    }
}