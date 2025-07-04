package com.awesomeapp.module_1_97

sealed class State97_37 {
    data object Loading : State97_37()
    data class Success(val data: String) : State97_37()
    data class Error(val message: String) : State97_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}