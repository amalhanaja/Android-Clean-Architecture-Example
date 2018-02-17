package io.github.amalhanaja.androidcleanarchitectureexample

import android.os.Bundle
import android.widget.Toast
import io.github.amalhanaja.androidcleanarchitectureexample.base.presentation.BaseActivity
import io.github.amalhanaja.androidcleanarchitectureexample.data.repository.LoginRepositoryImpl
import io.github.amalhanaja.androidcleanarchitectureexample.domain.repository.LoginRepository
import io.github.amalhanaja.androidcleanarchitectureexample.domain.usecase.LoginUseCase
import io.github.amalhanaja.androidcleanarchitectureexample.modelview.LoginInfoModelView

class MainActivity : BaseActivity() {

    private val loginUseCase by lazy {
        LoginUseCase(repository)
    }

    private val repository: LoginRepository = LoginRepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun doLogin(username: String, password: String){
        loginUseCase.execute(LoginUseCase.Params.paramsFor(username, password)).run {
            showSelamatDatangToast(LoginInfoModelView(name))
        }

    }

    private fun showSelamatDatangToast(loginModelView: LoginInfoModelView){
        Toast.makeText(this, loginModelView.name, Toast.LENGTH_SHORT).show()
    }

    override val layoutResourceId: Int?
        get() = R.layout.activity_main
}
