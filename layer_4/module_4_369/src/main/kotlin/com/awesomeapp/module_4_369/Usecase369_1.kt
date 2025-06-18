package com.awesomeapp.module_4_369

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase369_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase369_1 UseCase")
    }
}