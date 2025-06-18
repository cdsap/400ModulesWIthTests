package com.awesomeapp.module_0_67

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase67_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase67_1 UseCase")
    }
}