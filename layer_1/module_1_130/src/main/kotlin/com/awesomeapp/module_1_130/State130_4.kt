package com.awesomeapp.module_1_130

sealed class State130_4 {
    data object Loading : State130_4()
    data class Success(val data: String) : State130_4()
    data class Error(val message: String) : State130_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}