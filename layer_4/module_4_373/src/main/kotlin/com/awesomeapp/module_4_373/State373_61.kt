package com.awesomeapp.module_4_373

sealed class State373_61 {
    data object Loading : State373_61()
    data class Success(val data: String) : State373_61()
    data class Error(val message: String) : State373_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}