package com.awesomeapp.module_4_378

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase378_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase378_1 UseCase")
    }
}