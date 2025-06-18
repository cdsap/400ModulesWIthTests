package com.awesomeapp.module_2_186

sealed class State186_163 {
    data object Loading : State186_163()
    data class Success(val data: String) : State186_163()
    data class Error(val message: String) : State186_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}