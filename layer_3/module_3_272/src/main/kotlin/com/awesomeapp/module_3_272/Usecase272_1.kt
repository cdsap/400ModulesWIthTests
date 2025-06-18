package com.awesomeapp.module_3_272

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase272_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase272_1 UseCase")
    }
}