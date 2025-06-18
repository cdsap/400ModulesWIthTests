package com.awesomeapp.module_4_380

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase380_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase380_1 UseCase")
    }
}