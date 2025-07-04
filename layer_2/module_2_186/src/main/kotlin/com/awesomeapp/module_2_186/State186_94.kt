package com.awesomeapp.module_2_186

sealed class State186_94 {
    data object Loading : State186_94()
    data class Success(val data: String) : State186_94()
    data class Error(val message: String) : State186_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}