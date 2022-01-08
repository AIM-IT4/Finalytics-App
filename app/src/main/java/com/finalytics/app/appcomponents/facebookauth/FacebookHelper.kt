package com.finalytics.app.appcomponents.facebookauth

import com.facebook.*
import com.facebook.AccessToken
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult


class FacebookHelper() {

    /** This method will be used to login
     *  @param callbackManager
     *  @param handleResult FacebookCallback of LoginResult
     *  How to use:
     *  [Class_Object].login(callbackManager,object:FacebookCallback<LoginResult> { methods to implement })
     * */
    fun login(callbackManager: CallbackManager,handleResult: FacebookCallback<LoginResult>) {
        LoginManager.getInstance().registerCallback(callbackManager, handleResult)
    }

    /** This method will check the token and will return token if not null and not expired
     *  @return accessToken
     *  How to use:
     *  [Class_Object].checkToken()
     * */
    fun checkToken():AccessToken?{
        val accessToken = AccessToken.getCurrentAccessToken()
        val isLoggedIn: Boolean = accessToken != null && !accessToken.isExpired
        if(isLoggedIn){
            return accessToken
        }
        return null
    }

    /** This method will be used to fetch the user details
     *  @param onComplete the GraphResponse which will ne handled by the user
     *  How to use:
     *  [Class_Object].fetchUserDetails { response -> }
     * */
    fun fetchUserDetails(onComplete: (response: GraphResponse?) -> Unit) {
        val accessToken = checkToken()
        GraphRequest(
            accessToken,
            "/" + AccessToken.getCurrentAccessToken().userId + "/",
            null,
            HttpMethod.GET, GraphRequest.Callback { response -> onComplete(response) }
        ).executeAsync()
    }


    /** This method will be used for logout
     *  How to use:
     *  [Class_Object].Logout()
     * */
    fun logout(){
        LoginManager.getInstance().logOut()
    }
}