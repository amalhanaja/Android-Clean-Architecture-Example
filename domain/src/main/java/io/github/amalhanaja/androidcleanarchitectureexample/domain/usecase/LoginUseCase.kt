package io.github.amalhanaja.androidcleanarchitectureexample.domain.usecase

import io.github.amalhanaja.androidcleanarchitectureexample.domain.model.LoginInfoModel
import io.github.amalhanaja.androidcleanarchitectureexample.domain.repository.LoginRepository

/**
 * Created by Alfian Akmal Hanantio on 17/02/18.
 * Email : amalhanaja@gmail.com
 * Github: https://github.com/amalhanaja/
 */
class LoginUseCase(private val repository: LoginRepository) {

    fun execute(params: Params): LoginInfoModel {
        return repository.retrieveLoginInfo(params.username, params.password)
    }

    class Params internal constructor(val username: String, val password: String){
        companion object {
            fun paramsFor(username: String, password: String): Params =
                    Params(username, password)
        }
    }
}