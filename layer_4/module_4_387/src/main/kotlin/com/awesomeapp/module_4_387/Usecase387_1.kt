package com.awesomeapp.module_4_387

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase387_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase387_1 UseCase")
    }
}