package com.base.mvp

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test

class BasePresenterTest {
    private lateinit var basePresenter: BasePresenter<BaseView>
    private val view: BaseView = mock()

    @Before
    fun setUp() {
        basePresenter = BasePresenter()
    }

    @Test
    fun attachView() {
        basePresenter.attachView(view)

        verify(view).setPresenter(basePresenter)
    }
}