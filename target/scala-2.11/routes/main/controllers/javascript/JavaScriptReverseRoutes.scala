
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/KK/Documents/4156/final_project/yoda/conf/routes
// @DATE:Tue Dec 22 17:22:58 EST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAuthentication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def runInvalidator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.runInvalidator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "invalidator"})
        }
      """
    )
  
    // @LINE:24
    def signout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.signout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:12
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:14
    def signupUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.signupUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signupUser"})
        }
      """
    )
  
    // @LINE:55
    def runEvaluation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.runEvaluation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluateFlags"})
        }
      """
    )
  
    // @LINE:48
    def validateSignup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.validateSignup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
        }
      """
    )
  
    // @LINE:10
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseRequestSession(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RequestSession.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "requestsession"})
        }
      """
    )
  
    // @LINE:28
    def AddNewSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RequestSession.AddNewSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addNewSession"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:35
    def exception: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exception",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addNewSession"})
          }
        
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseUser(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:8
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:39
    def addTutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.addTutor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTutor"})
        }
      """
    )
  
    // @LINE:18
    def beatutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.beatutor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "beatutor"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseSessions(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def sendReminders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Sessions.sendReminders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reminder"})
        }
      """
    )
  
    // @LINE:46
    def confirmRejectSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Sessions.confirmRejectSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmRejectSession"})
        }
      """
    )
  
    // @LINE:51
    def addRating: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Sessions.addRating",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addRating"})
        }
      """
    )
  
    // @LINE:20
    def mySessions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Sessions.mySessions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mysessions"})
        }
      """
    )
  
  }


}