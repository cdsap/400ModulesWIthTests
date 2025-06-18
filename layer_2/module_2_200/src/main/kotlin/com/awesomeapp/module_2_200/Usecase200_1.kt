package com.awesomeapp.module_2_200

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase200_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase200_1 UseCase")
    }
}