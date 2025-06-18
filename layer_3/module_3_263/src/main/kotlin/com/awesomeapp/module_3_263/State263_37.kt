package com.awesomeapp.module_3_263

sealed class State263_37 {
    data object Loading : State263_37()
    data class Success(val data: String) : State263_37()
    data class Error(val message: String) : State263_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}