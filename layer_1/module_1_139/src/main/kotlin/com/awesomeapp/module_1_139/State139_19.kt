package com.awesomeapp.module_1_139

sealed class State139_19 {
    data object Loading : State139_19()
    data class Success(val data: String) : State139_19()
    data class Error(val message: String) : State139_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}