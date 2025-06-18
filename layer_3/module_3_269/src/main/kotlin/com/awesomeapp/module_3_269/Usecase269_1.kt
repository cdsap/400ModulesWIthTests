package com.awesomeapp.module_3_269

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase269_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase269_1 UseCase")
    }
}