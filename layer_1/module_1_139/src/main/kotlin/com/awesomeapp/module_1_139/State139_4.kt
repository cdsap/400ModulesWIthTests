package com.awesomeapp.module_1_139

sealed class State139_4 {
    data object Loading : State139_4()
    data class Success(val data: String) : State139_4()
    data class Error(val message: String) : State139_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}