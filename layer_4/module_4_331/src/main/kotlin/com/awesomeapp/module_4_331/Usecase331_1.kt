package com.awesomeapp.module_4_331

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase331_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase331_1 UseCase")
    }
}