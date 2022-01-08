package com.finalytics.app.modules.googlepixel2xl3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl3.`data`.model.GooglePixel2Xl3Model

public class GooglePixel2Xl3VM : ViewModel() {
  public val googlePixel2Xl3Model: MutableLiveData<GooglePixel2Xl3Model> =
      MutableLiveData(GooglePixel2Xl3Model())
}
