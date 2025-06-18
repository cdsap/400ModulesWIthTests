package com.awesomeapp.module_4_337

sealed class State337_91 {
    data object Loading : State337_91()
    data class Success(val data: String) : State337_91()
    data class Error(val message: String) : State337_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}