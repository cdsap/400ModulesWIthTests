package com.awesomeapp.module_2_168

sealed class State168_38 {
    data object Loading : State168_38()
    data class Success(val data: String) : State168_38()
    data class Error(val message: String) : State168_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}