package com.awesomeapp.module_1_85

sealed class State85_4 {
    data object Loading : State85_4()
    data class Success(val data: String) : State85_4()
    data class Error(val message: String) : State85_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}