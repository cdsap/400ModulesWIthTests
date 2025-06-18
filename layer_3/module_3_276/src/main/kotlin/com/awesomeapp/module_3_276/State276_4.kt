package com.awesomeapp.module_3_276

sealed class State276_4 {
    data object Loading : State276_4()
    data class Success(val data: String) : State276_4()
    data class Error(val message: String) : State276_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}