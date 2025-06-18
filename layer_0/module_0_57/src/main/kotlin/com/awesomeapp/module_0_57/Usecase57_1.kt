package com.awesomeapp.module_0_57

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase57_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase57_1 UseCase")
    }
}