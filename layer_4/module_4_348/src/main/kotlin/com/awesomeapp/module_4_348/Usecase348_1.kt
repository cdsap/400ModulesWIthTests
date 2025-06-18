package com.awesomeapp.module_4_348

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase348_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase348_1 UseCase")
    }
}