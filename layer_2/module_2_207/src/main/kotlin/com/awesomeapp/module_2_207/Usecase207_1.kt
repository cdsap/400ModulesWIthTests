package com.awesomeapp.module_2_207

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase207_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase207_1 UseCase")
    }
}