package com.awesomeapp.module_2_221

sealed class State221_22 {
    data object Loading : State221_22()
    data class Success(val data: String) : State221_22()
    data class Error(val message: String) : State221_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}