package com.awesomeapp.module_4_363

sealed class State363_172 {
    data object Loading : State363_172()
    data class Success(val data: String) : State363_172()
    data class Error(val message: String) : State363_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}