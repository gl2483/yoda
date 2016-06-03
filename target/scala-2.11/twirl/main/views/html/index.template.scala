
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("May the force be with you!")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
"""),format.raw/*4.1*/("""<div style="margin-left: 32%;">
    <form action=""""),_display_(/*5.20*/routes/*5.26*/.Authentication.authenticate()),format.raw/*5.56*/("""" method="post" style="padding-top: 170px; padding-left: 20px">
        <fieldset style="width:400px">
            <legend>Login or Sign up!</legend>

            <label>Username
                <input type="text" placeholder="your Columbia e-mail address" name="user_name">
            </label>

            <label>Password
                <input type="password" placeholder="password" name="password">
            </label>

            <button class="button tiny" style="margin-left:40%; background: black">Login</button>
        </fieldset>
    </form>

    <form action=""""),_display_(/*21.20*/routes/*21.26*/.Authentication.signup()),format.raw/*21.50*/("""" method="GET" style="padding-top: 20px; padding-left: 20px">
        <fieldset style="width:400px">
            <legend style="text-align:center">Sign up now! Yoda is open to all Columbia students.</legend>
                <button class="button tiny" style="margin-left:40%; background: black">Sign up!</button>
        </fieldset>
    </form>
</div>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/index.scala.html
                  HASH: 91038ce7fe8d79e61b75ab26365c791ff982c182
                  MATRIX: 745->1|857->18|885->21|927->55|966->57|993->58|1070->109|1084->115|1134->145|1737->721|1752->727|1797->751|2180->1104
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|52->21|52->21|52->21|59->28
                  -- GENERATED --
              */
          