package com.awesomeapp.module_2_217

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase217_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase217_1 UseCase")
    }
}