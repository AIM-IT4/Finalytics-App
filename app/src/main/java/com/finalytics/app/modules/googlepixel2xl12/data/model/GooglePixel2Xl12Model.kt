package com.finalytics.app.modules.googlepixel2xl12.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl12Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOpportunities: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_opportunities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIndianEconomy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_indian_economy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhonepeComesI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_phonepe_comes_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsAPlatformC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_as_a_platform_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
