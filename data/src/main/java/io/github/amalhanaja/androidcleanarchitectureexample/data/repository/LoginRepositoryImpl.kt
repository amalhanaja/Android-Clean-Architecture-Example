package io.github.amalhanaja.androidcleanarchitectureexample.data.repository

import io.github.amalhanaja.androidcleanarchitectureexample.data.local.LoginInfoMock
import io.github.amalhanaja.androidcleanarchitectureexample.domain.model.LoginInfoModel
import io.github.amalhanaja.androidcleanarchitectureexample.domain.repository.LoginRepository

/**
 * Created by Alfian Akmal Hanantio on 17/02/18.
 * Email : amalhanaja@gmail.com
 * Github: https://github.com/amalhanaja/
 */
class LoginRepositoryImpl: LoginRepository {
    override fun retrieveLoginInfo(username: String, password: String): LoginInfoModel {
        return LoginInfoMock.getMockData().run {
            LoginInfoModel(username, name)
        }
    }
}