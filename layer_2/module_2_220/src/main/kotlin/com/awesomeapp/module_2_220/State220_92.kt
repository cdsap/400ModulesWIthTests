package com.awesomeapp.module_2_220

sealed class State220_92 {
    data object Loading : State220_92()
    data class Success(val data: String) : State220_92()
    data class Error(val message: String) : State220_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}