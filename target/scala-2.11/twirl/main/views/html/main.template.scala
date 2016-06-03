
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("stylesheets/foundation.min.css")),format.raw/*9.96*/("""">
        <script type='text/javascript' src='"""),_display_(/*10.46*/routes/*10.52*/.Assets.versioned("javascripts/foundation.min.js")),format.raw/*10.102*/("""'></script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        """),format.raw/*13.102*/("""
        """),format.raw/*14.9*/("""<script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div>
            <img src=""""),_display_(/*18.24*/routes/*18.30*/.Assets.versioned("images/yoda.png")),format.raw/*18.66*/("""" width="200px"; style="float: left">
        </div>
        <div>
            <img src=""""),_display_(/*21.24*/routes/*21.30*/.Assets.versioned("images/columbia.png")),format.raw/*21.70*/("""" style="width:400px; float: right">
        </div>
            """),_display_(/*23.14*/content),format.raw/*23.21*/("""
        """),format.raw/*24.9*/("""<div class="contain-to-grid sticky" style="margin-top: 11%; background: black">
            <nav class="top-bar" data-topbar role="navigation" data-options="sticky_on: large" style="background: black">
                <center>
                    <p style="color: white; font-family: initial; margin-top: 0.5rem">
                    Developed by: Cool Kids Anonymous for COMS W4156 Advanced Software Engineering (Prof. Gail Kaiser)
                    </p>
                </center>
            </nav>
        </div>
        <div class="modal"><!-- Place at bottom of page --></div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/main.scala.html
                  HASH: 3fe6c42965065c56c44bd66033f91e2a12255333
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1244->249|1258->255|1329->306|1404->354|1419->360|1491->410|1588->480|1603->486|1664->525|1802->727|1838->736|1879->750|1894->756|1956->797|2078->892|2093->898|2150->934|2267->1024|2282->1030|2343->1070|2435->1135|2463->1142|2499->1151
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|44->13|45->14|45->14|45->14|45->14|49->18|49->18|49->18|52->21|52->21|52->21|54->23|54->23|55->24
                  -- GENERATED --
              */
          