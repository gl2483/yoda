
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/KK/Documents/4156/final_project/yoda/conf/routes
// @DATE:Tue Dec 22 17:22:58 EST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: controllers.Application,
  // @LINE:8
  User_3: controllers.User,
  // @LINE:10
  Authentication_2: controllers.Authentication,
  // @LINE:20
  Sessions_0: controllers.Sessions,
  // @LINE:26
  RequestSession_1: controllers.RequestSession,
  // @LINE:31
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:8
    User_3: controllers.User,
    // @LINE:10
    Authentication_2: controllers.Authentication,
    // @LINE:20
    Sessions_0: controllers.Sessions,
    // @LINE:26
    RequestSession_1: controllers.RequestSession,
    // @LINE:31
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_5, User_3, Authentication_2, Sessions_0, RequestSession_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, User_3, Authentication_2, Sessions_0, RequestSession_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.User.home()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Authentication.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Authentication.signup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupUser""", """controllers.Authentication.signupUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.User.profile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """beatutor""", """controllers.User.beatutor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mysessions""", """controllers.Sessions.mySessions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.Application.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.Authentication.signout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """requestsession""", """controllers.RequestSession.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNewSession""", """controllers.RequestSession.AddNewSession()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNewSession""", """controllers.Application.exception()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Application.exception()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTutor""", """controllers.User.addTutor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmRejectSession""", """controllers.Sessions.confirmRejectSession()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate""", """controllers.Authentication.validateSignup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addRating""", """controllers.Sessions.addRating()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """invalidator""", """controllers.Authentication.runInvalidator()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evaluateFlags""", """controllers.Authentication.runEvaluation()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reminder""", """controllers.Sessions.sendReminders()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_User_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_User_home1_invoker = createInvoker(
    User_3.home(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "home",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Authentication_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Authentication_authenticate2_invoker = createInvoker(
    Authentication_2.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Authentication_signup3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Authentication_signup3_invoker = createInvoker(
    Authentication_2.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Authentication_signupUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupUser")))
  )
  private[this] lazy val controllers_Authentication_signupUser4_invoker = createInvoker(
    Authentication_2.signupUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "signupUser",
      Nil,
      "POST",
      """""",
      this.prefix + """signupUser"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_User_profile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_User_profile5_invoker = createInvoker(
    User_3.profile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_User_beatutor6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("beatutor")))
  )
  private[this] lazy val controllers_User_beatutor6_invoker = createInvoker(
    User_3.beatutor(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "beatutor",
      Nil,
      "GET",
      """""",
      this.prefix + """beatutor"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Sessions_mySessions7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mysessions")))
  )
  private[this] lazy val controllers_Sessions_mySessions7_invoker = createInvoker(
    Sessions_0.mySessions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Sessions",
      "mySessions",
      Nil,
      "GET",
      """""",
      this.prefix + """mysessions"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_about8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_Application_about8_invoker = createInvoker(
    Application_5.about(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Authentication_signout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_Authentication_signout9_invoker = createInvoker(
    Authentication_2.signout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "signout",
      Nil,
      "GET",
      """""",
      this.prefix + """signout"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RequestSession_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("requestsession")))
  )
  private[this] lazy val controllers_RequestSession_index10_invoker = createInvoker(
    RequestSession_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RequestSession",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """requestsession"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RequestSession_AddNewSession11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNewSession")))
  )
  private[this] lazy val controllers_RequestSession_AddNewSession11_invoker = createInvoker(
    RequestSession_1.AddNewSession(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RequestSession",
      "AddNewSession",
      Nil,
      "POST",
      """""",
      this.prefix + """addNewSession"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_exception13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNewSession")))
  )
  private[this] lazy val controllers_Application_exception13_invoker = createInvoker(
    Application_5.exception(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exception",
      Nil,
      "GET",
      """""",
      this.prefix + """addNewSession"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_exception14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Application_exception14_invoker = createInvoker(
    Application_5.exception(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exception",
      Nil,
      "GET",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_User_addTutor15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTutor")))
  )
  private[this] lazy val controllers_User_addTutor15_invoker = createInvoker(
    User_3.addTutor(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "addTutor",
      Nil,
      "POST",
      """Be a Tutor""",
      this.prefix + """addTutor"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Sessions_confirmRejectSession16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmRejectSession")))
  )
  private[this] lazy val controllers_Sessions_confirmRejectSession16_invoker = createInvoker(
    Sessions_0.confirmRejectSession(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Sessions",
      "confirmRejectSession",
      Nil,
      "POST",
      """ Tutor Accepts are declines request""",
      this.prefix + """confirmRejectSession"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Authentication_validateSignup17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate")))
  )
  private[this] lazy val controllers_Authentication_validateSignup17_invoker = createInvoker(
    Authentication_2.validateSignup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "validateSignup",
      Nil,
      "GET",
      """""",
      this.prefix + """validate"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Sessions_addRating18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addRating")))
  )
  private[this] lazy val controllers_Sessions_addRating18_invoker = createInvoker(
    Sessions_0.addRating(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Sessions",
      "addRating",
      Nil,
      "POST",
      """ Add rating for a session""",
      this.prefix + """addRating"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Authentication_runInvalidator19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("invalidator")))
  )
  private[this] lazy val controllers_Authentication_runInvalidator19_invoker = createInvoker(
    Authentication_2.runInvalidator(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "runInvalidator",
      Nil,
      "GET",
      """ cron jobs""",
      this.prefix + """invalidator"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Authentication_runEvaluation20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evaluateFlags")))
  )
  private[this] lazy val controllers_Authentication_runEvaluation20_invoker = createInvoker(
    Authentication_2.runEvaluation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "runEvaluation",
      Nil,
      "GET",
      """""",
      this.prefix + """evaluateFlags"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Sessions_sendReminders21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reminder")))
  )
  private[this] lazy val controllers_Sessions_sendReminders21_invoker = createInvoker(
    Sessions_0.sendReminders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Sessions",
      "sendReminders",
      Nil,
      "GET",
      """""",
      this.prefix + """reminder"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.index())
      }
  
    // @LINE:8
    case controllers_User_home1_route(params) =>
      call { 
        controllers_User_home1_invoker.call(User_3.home())
      }
  
    // @LINE:10
    case controllers_Authentication_authenticate2_route(params) =>
      call { 
        controllers_Authentication_authenticate2_invoker.call(Authentication_2.authenticate())
      }
  
    // @LINE:12
    case controllers_Authentication_signup3_route(params) =>
      call { 
        controllers_Authentication_signup3_invoker.call(Authentication_2.signup())
      }
  
    // @LINE:14
    case controllers_Authentication_signupUser4_route(params) =>
      call { 
        controllers_Authentication_signupUser4_invoker.call(Authentication_2.signupUser())
      }
  
    // @LINE:16
    case controllers_User_profile5_route(params) =>
      call { 
        controllers_User_profile5_invoker.call(User_3.profile())
      }
  
    // @LINE:18
    case controllers_User_beatutor6_route(params) =>
      call { 
        controllers_User_beatutor6_invoker.call(User_3.beatutor())
      }
  
    // @LINE:20
    case controllers_Sessions_mySessions7_route(params) =>
      call { 
        controllers_Sessions_mySessions7_invoker.call(Sessions_0.mySessions())
      }
  
    // @LINE:22
    case controllers_Application_about8_route(params) =>
      call { 
        controllers_Application_about8_invoker.call(Application_5.about())
      }
  
    // @LINE:24
    case controllers_Authentication_signout9_route(params) =>
      call { 
        controllers_Authentication_signout9_invoker.call(Authentication_2.signout())
      }
  
    // @LINE:26
    case controllers_RequestSession_index10_route(params) =>
      call { 
        controllers_RequestSession_index10_invoker.call(RequestSession_1.index())
      }
  
    // @LINE:28
    case controllers_RequestSession_AddNewSession11_route(params) =>
      call { 
        controllers_RequestSession_AddNewSession11_invoker.call(RequestSession_1.AddNewSession())
      }
  
    // @LINE:31
    case controllers_Assets_versioned12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:35
    case controllers_Application_exception13_route(params) =>
      call { 
        controllers_Application_exception13_invoker.call(Application_5.exception())
      }
  
    // @LINE:36
    case controllers_Application_exception14_route(params) =>
      call { 
        controllers_Application_exception14_invoker.call(Application_5.exception())
      }
  
    // @LINE:39
    case controllers_User_addTutor15_route(params) =>
      call { 
        controllers_User_addTutor15_invoker.call(User_3.addTutor())
      }
  
    // @LINE:46
    case controllers_Sessions_confirmRejectSession16_route(params) =>
      call { 
        controllers_Sessions_confirmRejectSession16_invoker.call(Sessions_0.confirmRejectSession())
      }
  
    // @LINE:48
    case controllers_Authentication_validateSignup17_route(params) =>
      call { 
        controllers_Authentication_validateSignup17_invoker.call(Authentication_2.validateSignup())
      }
  
    // @LINE:51
    case controllers_Sessions_addRating18_route(params) =>
      call { 
        controllers_Sessions_addRating18_invoker.call(Sessions_0.addRating())
      }
  
    // @LINE:54
    case controllers_Authentication_runInvalidator19_route(params) =>
      call { 
        controllers_Authentication_runInvalidator19_invoker.call(Authentication_2.runInvalidator())
      }
  
    // @LINE:55
    case controllers_Authentication_runEvaluation20_route(params) =>
      call { 
        controllers_Authentication_runEvaluation20_invoker.call(Authentication_2.runEvaluation())
      }
  
    // @LINE:56
    case controllers_Sessions_sendReminders21_route(params) =>
      call { 
        controllers_Sessions_sendReminders21_invoker.call(Sessions_0.sendReminders())
      }
  }
}