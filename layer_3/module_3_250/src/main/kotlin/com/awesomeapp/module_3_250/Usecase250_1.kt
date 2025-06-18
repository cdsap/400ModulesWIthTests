package com.awesomeapp.module_3_250

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Usecase250_1 {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase250_1 UseCase")
    }
}