package com.awesomeapp.module_3_300

sealed class State300_14 {
    data object Loading : State300_14()
    data class Success(val data: String) : State300_14()
    data class Error(val message: String) : State300_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}