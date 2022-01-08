package com.finalytics.app.modules.googlepixel2xl14.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl14Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStrength: String? = MyApp.getInstance().resources.getString(R.string.lbl_strength)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForInstanceI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_for_instance_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThisAllowsFor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_allows_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
