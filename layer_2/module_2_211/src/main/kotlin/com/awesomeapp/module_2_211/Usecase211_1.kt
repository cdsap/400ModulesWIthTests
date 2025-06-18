package com.awesomeapp.module_2_211

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase211_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase211_1 UseCase")
    }
}