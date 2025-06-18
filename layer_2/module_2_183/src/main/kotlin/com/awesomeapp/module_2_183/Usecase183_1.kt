package com.awesomeapp.module_2_183

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase183_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase183_1 UseCase")
    }
}