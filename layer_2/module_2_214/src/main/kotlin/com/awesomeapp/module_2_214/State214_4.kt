package com.awesomeapp.module_2_214

sealed class State214_4 {
    data object Loading : State214_4()
    data class Success(val data: String) : State214_4()
    data class Error(val message: String) : State214_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}