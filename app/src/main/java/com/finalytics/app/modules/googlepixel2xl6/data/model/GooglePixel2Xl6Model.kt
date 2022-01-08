package com.finalytics.app.modules.googlepixel2xl6.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl6Model(
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
  public var txtWellKnownPay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_well_known_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInitiatorPayt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_initiator_payt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAcceptancePay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acceptance_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConsumerFriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consumer_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
