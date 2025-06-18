package com.awesomeapp.module_3_296

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase296_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase296_1 UseCase")
    }
}