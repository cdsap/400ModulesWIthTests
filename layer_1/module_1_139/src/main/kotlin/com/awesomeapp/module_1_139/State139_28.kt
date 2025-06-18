package com.awesomeapp.module_1_139

sealed class State139_28 {
    data object Loading : State139_28()
    data class Success(val data: String) : State139_28()
    data class Error(val message: String) : State139_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}