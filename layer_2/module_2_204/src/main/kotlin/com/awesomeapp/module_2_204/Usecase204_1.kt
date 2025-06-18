package com.awesomeapp.module_2_204

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase204_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase204_1 UseCase")
    }
}