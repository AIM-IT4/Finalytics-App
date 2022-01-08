package com.finalytics.app.modules.googlepixel2xl3.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeBack: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterEmailValue: String? = null
)
