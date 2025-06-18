package com.awesomeapp.module_3_277

sealed class State277_37 {
    data object Loading : State277_37()
    data class Success(val data: String) : State277_37()
    data class Error(val message: String) : State277_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}