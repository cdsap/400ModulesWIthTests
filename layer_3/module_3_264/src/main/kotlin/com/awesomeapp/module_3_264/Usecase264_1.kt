package com.awesomeapp.module_3_264

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase264_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase264_1 UseCase")
    }
}