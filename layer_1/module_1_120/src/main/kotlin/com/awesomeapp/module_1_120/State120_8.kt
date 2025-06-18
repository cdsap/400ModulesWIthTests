package com.awesomeapp.module_1_120

sealed class State120_8 {
    data object Loading : State120_8()
    data class Success(val data: String) : State120_8()
    data class Error(val message: String) : State120_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}