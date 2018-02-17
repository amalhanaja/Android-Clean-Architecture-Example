package io.github.amalhanaja.androidcleanarchitectureexample.data.local

import io.github.amalhanaja.androidcleanarchitectureexample.data.entity.LoginInfoEntity

/**
 * Created by Alfian Akmal Hanantio on 17/02/18.
 * Email : amalhanaja@gmail.com
 * Github: https://github.com/amalhanaja/
 */
object LoginInfoMock {
    fun getMockData(): LoginInfoEntity {
        return LoginInfoEntity("UserName", "name", "eyd123njkanf3u1.nkjnfawihf32.cadas")
    }
}