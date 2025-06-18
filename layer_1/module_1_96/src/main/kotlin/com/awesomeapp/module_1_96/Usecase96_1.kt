package com.awesomeapp.module_1_96

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase96_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase96_1 UseCase")
    }
}