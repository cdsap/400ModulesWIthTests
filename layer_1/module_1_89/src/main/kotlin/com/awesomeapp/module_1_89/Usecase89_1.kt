package com.awesomeapp.module_1_89

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase89_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase89_1 UseCase")
    }
}