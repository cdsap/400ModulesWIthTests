package com.awesomeapp.module_4_390

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase390_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase390_1 UseCase")
    }
}