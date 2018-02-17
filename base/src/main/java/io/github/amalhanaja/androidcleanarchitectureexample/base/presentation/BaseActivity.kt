package io.github.amalhanaja.androidcleanarchitectureexample.base.presentation

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View

/**
 * Created by Alfian Akmal Hanantio on 17/02/18.
 * Email : amalhanaja@gmail.com
 * Github: https://github.com/amalhanaja/
 */
abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        layoutResourceId?.run { setContentView(this) }
        super.onCreate(savedInstanceState, persistentState)
    }

    protected abstract val layoutResourceId: Int?
}