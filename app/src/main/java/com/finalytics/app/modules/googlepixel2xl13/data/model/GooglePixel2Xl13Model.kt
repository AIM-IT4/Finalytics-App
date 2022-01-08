package com.finalytics.app.modules.googlepixel2xl13.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl13Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThreats: String? = MyApp.getInstance().resources.getString(R.string.lbl_threats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtItIsToBeNot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_is_to_be_not)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
