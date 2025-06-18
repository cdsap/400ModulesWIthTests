package com.awesomeapp.module_3_253

sealed class State253_37 {
    data object Loading : State253_37()
    data class Success(val data: String) : State253_37()
    data class Error(val message: String) : State253_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}