package com.awesomeapp.module_1_153

sealed class State153_175 {
    data object Loading : State153_175()
    data class Success(val data: String) : State153_175()
    data class Error(val message: String) : State153_175()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}