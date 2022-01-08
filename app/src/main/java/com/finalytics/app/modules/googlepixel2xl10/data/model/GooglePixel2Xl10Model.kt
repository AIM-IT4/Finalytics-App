package com.finalytics.app.modules.googlepixel2xl10.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl10Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStrengths: String? = MyApp.getInstance().resources.getString(R.string.lbl_strengths)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhonepeIsARb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_phonepe_is_a_rb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInJuneAbout: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_june_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSafeAndSecure: String? =
      MyApp.getInstance().resources.getString(R.string.msg_safe_and_secure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
