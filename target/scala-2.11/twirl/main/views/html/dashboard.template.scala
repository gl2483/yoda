
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String)(fullname: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*2.1*/("""<!-- Takes user information as parameters, so that they can be greeted upon loggin in! -->

<!DOCTYPE html>

<html lang="en">
<head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/foundation.min.css")),format.raw/*9.92*/("""">
    <script type='text/javascript' src='"""),_display_(/*10.42*/routes/*10.48*/.Assets.versioned("javascripts/foundation.min.js")),format.raw/*10.98*/("""'></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("images/favicon.png")),format.raw/*11.100*/("""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    """),format.raw/*13.98*/("""
    """),format.raw/*14.5*/("""<script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.66*/("""" type="text/javascript"></script>
    </head>
<body>
    <nav class="top-bar" data-topbar role="navigation" style="background: black; padding-left: 15px">
      <ul class="title-area">
        <li class="name">
          <h1>
          <a href="#"><center>
            <img src=""""),_display_(/*22.24*/routes/*22.30*/.Assets.versioned("images/yoda.png")),format.raw/*22.66*/("""" width="80px"; style="float: left">
          </a></center>
          </h1>
        </li>
      </ul>

      <section class="top-bar-section">
        <!-- Right Nav Section -->
        <ul class="right">
          <li style="width:200px">
            <center><a href="#" style="font-family: initial; color: white">Hello """),_display_(/*32.83*/username),format.raw/*32.91*/("""!</a></center>
          </li>
        </ul>
      </section>
    </nav>

    <div class="icon-bar large-vertical four-up" style="padding-top: 10px; background: black">
      <a class="item" style="font-family: initial">
        <img src=""""),_display_(/*40.20*/routes/*40.26*/.Assets.versioned("images/profile.jpg")),format.raw/*40.65*/("""" >
        <label>My Profile</label>
      </a>
      <a class="item active" style="font-family: initial">
        <img src=""""),_display_(/*44.20*/routes/*44.26*/.Assets.versioned("images/mysessions.png")),format.raw/*44.68*/("""" >
        <label>My Sessions</label>
      </a>
      <a class="item" style="font-family: initial">
        <img src=""""),_display_(/*48.20*/routes/*48.26*/.Assets.versioned("images/request.jpg")),format.raw/*48.65*/("""" >
        <label>Request Session</label>
      </a>
      <a class="item" style="font-family: initial">
        <img src=""""),_display_(/*52.20*/routes/*52.26*/.Assets.versioned("images/beatutor.jpg")),format.raw/*52.66*/("""" >
        <label>Be a tutor</label>
      </a>
      <a class="item" style="font-family: initial">
        <img src=""""),_display_(/*56.20*/routes/*56.26*/.Assets.versioned("images/logout.png")),format.raw/*56.64*/("""" >
        <label>Log out</label>
      </a>
      <a class="item" style="font-family: initial">
      <form action="" method="post">
        <img src=""""),_display_(/*61.20*/routes/*61.26*/.Assets.versioned("images/about.jpg")),format.raw/*61.63*/("""" >
        <button>About Yoda</button>
        </form>
      </a>
    </div>
  </body>
</html>

"""))
      }
    }
  }

  def render(username:String,fullname:String): play.twirl.api.HtmlFormat.Appendable = apply(username)(fullname)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (username) => (fullname) => apply(username)(fullname)

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/dashboard.scala.html
                  HASH: 38ba070023607b896a6a19d788e5ac798374a472
                  MATRIX: 760->1|891->37|918->38|1126->220|1140->226|1201->267|1264->304|1278->310|1349->361|1420->405|1435->411|1506->461|1599->527|1614->533|1675->572|1804->766|1836->771|1877->785|1892->791|1954->832|2262->1113|2277->1119|2334->1155|2684->1478|2713->1486|2980->1726|2995->1732|3055->1771|3209->1898|3224->1904|3287->1946|3435->2067|3450->2073|3510->2112|3662->2237|3677->2243|3738->2283|3885->2403|3900->2409|3959->2447|4140->2601|4155->2607|4213->2644
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|44->13|45->14|45->14|45->14|45->14|53->22|53->22|53->22|63->32|63->32|71->40|71->40|71->40|75->44|75->44|75->44|79->48|79->48|79->48|83->52|83->52|83->52|87->56|87->56|87->56|92->61|92->61|92->61
                  -- GENERATED --
              */
          