package com.awesomeapp.module_3_272

sealed class State272_8 {
    data object Loading : State272_8()
    data class Success(val data: String) : State272_8()
    data class Error(val message: String) : State272_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}