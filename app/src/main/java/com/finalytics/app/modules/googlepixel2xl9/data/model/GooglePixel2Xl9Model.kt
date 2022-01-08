package com.finalytics.app.modules.googlepixel2xl9.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl9Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtThreats2: String? = MyApp.getInstance().resources.getString(R.string.lbl_threats2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBankServicesS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bank_services_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSecuritySecuri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_security_securi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCompetitionWi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_competition_wi)

)
