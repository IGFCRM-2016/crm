
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/crm/conf/routes
// @DATE:Tue Nov 01 21:48:51 CST 2016


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