package io.github.amalhanaja.androidcleanarchitectureexample.domain.repository

import io.github.amalhanaja.androidcleanarchitectureexample.domain.model.LoginInfoModel

/**
 * Created by Alfian Akmal Hanantio on 17/02/18.
 * Email : amalhanaja@gmail.com
 * Github: https://github.com/amalhanaja/
 */
interface LoginRepository {
    fun retrieveLoginInfo(username: String, password: String): LoginInfoModel
}