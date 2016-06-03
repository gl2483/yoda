
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<!-- Takes user information as parameters, so that they can be greeted upon loggin in! -->

<!DOCTYPE html>

<html lang="en">
  <head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/foundation.min.css")),format.raw/*9.92*/("""">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script type='text/javascript' src='"""),_display_(/*13.42*/routes/*13.48*/.Assets.versioned("javascripts/foundation.min.js")),format.raw/*13.98*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*14.42*/routes/*14.48*/.Assets.versioned("javascripts/jquery.raty.js")),format.raw/*14.95*/("""'></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""">
    """),format.raw/*16.98*/("""
    """),format.raw/*17.5*/("""<script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.66*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.versioned("javascripts/beatutor.js")),format.raw/*18.69*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("javascripts/mysessions.js")),format.raw/*19.71*/("""" type="text/javascript"></script>
  </head>
  <body>
    <div id="topbar" style="width: 100%; float: top">
      <nav class="top-bar" data-topbar role="navigation" style="background: black; padding-left: 15px">
        <ul class="title-area">
          <li class="name">
            <h1>
              <a href="#"><center>
                <img src=""""),_display_(/*28.28*/routes/*28.34*/.Assets.versioned("images/yoda.png")),format.raw/*28.70*/("""" width="80px"; style="float: left">
              </a></center>
            </h1>
          </li>
        </ul>
        <section class="top-bar-section">
            <!-- Right Nav Section -->
          <ul class="right">
            <li style="width:200px">
              <center><a href="#" style="font-family: initial; color: white">"""),_display_(/*37.79*/username),format.raw/*37.87*/("""</a></center>
            </li>
          </ul>
        </section>
      </nav>
    </div>
    """),_display_(/*43.6*/content),format.raw/*43.13*/("""
    """),format.raw/*44.5*/("""<div id="content" style="width: 12%; height: 100%; float: left; background: black">
      <div class="icon-bar large-vertical four-up" style="background: black; padding-left: 5px;">
        <a href="/profile" class="item" style="font-family: initial">
          <img src=""""),_display_(/*47.22*/routes/*47.28*/.Assets.versioned("images/profile.jpg")),format.raw/*47.67*/("""" >
          <label>My Profile</label>
        </a>
        <a href="/mysessions" class="item" style="font-family: initial">
          <img src=""""),_display_(/*51.22*/routes/*51.28*/.Assets.versioned("images/mysessions.png")),format.raw/*51.70*/("""" >
          <label>My Sessions</label>
        </a>
        <a href="/requestsession" class="item" style="font-family: initial">
          <img src=""""),_display_(/*55.22*/routes/*55.28*/.Assets.versioned("images/request.jpg")),format.raw/*55.67*/("""" >
          <label>Request Session</label>
        </a>
        <a href="/beatutor" class="item" style="font-family: initial">
          <img src=""""),_display_(/*59.22*/routes/*59.28*/.Assets.versioned("images/beatutor.jpg")),format.raw/*59.68*/("""" >
          <label>Be a tutor</label>
        </a>
        <a href="/signout" class="item" style="font-family: initial">
          <img src=""""),_display_(/*63.22*/routes/*63.28*/.Assets.versioned("images/logout.png")),format.raw/*63.66*/("""" >
          <label>Log out</label>
        </a>
        <a href="/about" class="item" style="font-family: initial">
          <img src=""""),_display_(/*67.22*/routes/*67.28*/.Assets.versioned("images/about.jpg")),format.raw/*67.65*/("""" >
          <label>About Yoda</label>
        </a>
      </div>
    </div>
      <!--<div class="contain-to-grid sticky" style="margin-top: 11%">
    <nav class="top-bar" data-topbar role="navigation" data-options="sticky_on: large">
      <center>
        <p style="color: white; font-family: initial; margin-top: 0.5rem">
          Developed by: Cool Kids Anonymous for COMS W4156 Advanced Software Engineering (Prof. Gail Kaiser)
        </p>
      </center>
    </nav>
  </div>-->
  </body>
</html>

"""))
      }
    }
  }

  def render(username:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(username)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (username) => (content) => apply(username)(content)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/home.scala.html
                  HASH: d32aae31051e724b8f983af34eaaddf621fafa63
                  MATRIX: 748->1|876->34|903->35|1113->219|1127->225|1188->266|1251->303|1265->309|1336->360|1665->662|1680->668|1751->718|1831->771|1846->777|1914->824|2007->890|2022->896|2083->935|2118->1035|2150->1040|2191->1054|2206->1060|2268->1101|2348->1154|2363->1160|2428->1204|2508->1257|2523->1263|2590->1309|2968->1660|2983->1666|3040->1702|3405->2040|3434->2048|3556->2144|3584->2151|3616->2156|3916->2429|3931->2435|3991->2474|4165->2621|4180->2627|4243->2669|4422->2821|4437->2827|4497->2866|4674->3016|4689->3022|4750->3062|4921->3206|4936->3212|4995->3250|5161->3389|5176->3395|5234->3432
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|59->28|59->28|59->28|68->37|68->37|74->43|74->43|75->44|78->47|78->47|78->47|82->51|82->51|82->51|86->55|86->55|86->55|90->59|90->59|90->59|94->63|94->63|94->63|98->67|98->67|98->67
                  -- GENERATED --
              */
          