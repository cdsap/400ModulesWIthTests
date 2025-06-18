package com.awesomeapp.module_3_260

sealed class State260_173 {
    data object Loading : State260_173()
    data class Success(val data: String) : State260_173()
    data class Error(val message: String) : State260_173()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}