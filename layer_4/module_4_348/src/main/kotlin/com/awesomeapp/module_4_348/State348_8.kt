package com.awesomeapp.module_4_348

sealed class State348_8 {
    data object Loading : State348_8()
    data class Success(val data: String) : State348_8()
    data class Error(val message: String) : State348_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}