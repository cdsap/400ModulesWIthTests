package com.awesomeapp.module_4_383

sealed class State383_25 {
    data object Loading : State383_25()
    data class Success(val data: String) : State383_25()
    data class Error(val message: String) : State383_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}