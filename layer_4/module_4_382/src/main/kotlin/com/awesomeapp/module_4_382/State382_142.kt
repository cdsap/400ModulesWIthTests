package com.awesomeapp.module_4_382

sealed class State382_142 {
    data object Loading : State382_142()
    data class Success(val data: String) : State382_142()
    data class Error(val message: String) : State382_142()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}