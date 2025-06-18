package com.awesomeapp.module_1_139

sealed class State139_55 {
    data object Loading : State139_55()
    data class Success(val data: String) : State139_55()
    data class Error(val message: String) : State139_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}