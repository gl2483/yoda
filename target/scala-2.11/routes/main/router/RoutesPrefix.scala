
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/KK/Documents/4156/final_project/yoda/conf/routes
// @DATE:Tue Dec 22 17:22:58 EST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
