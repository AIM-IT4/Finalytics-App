package com.finalytics.app.modules.googlepixel2xl7.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl7.`data`.model.GooglePixel2Xl7Model

public class GooglePixel2Xl7VM : ViewModel() {
  public val googlePixel2Xl7Model: MutableLiveData<GooglePixel2Xl7Model> =
      MutableLiveData(GooglePixel2Xl7Model())
}
