
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("I find your lack of faith to be disturbing...")/*3.55*/ {_display_(Seq[Any](format.raw/*3.57*/("""

"""),format.raw/*5.1*/("""<div style="margin-left: 32%;">
	<form action=""""),_display_(/*6.17*/routes/*6.23*/.Authentication.signupUser()),format.raw/*6.51*/("""" method="post" style="padding-top: 170px; padding-left: 20px">
        <fieldset style="width:400px">
            <legend>Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.</legend>

            <label>Username
                <input type="text" placeholder="your Columbia e-mail address" name="user_name">
            </label>
            
            <label>First Name
                <input type="text" placeholder="your first name" name="first_name">
            </label>

            <label>Last Name
                <input type="text" placeholder="your last name" name="last_name">
            </label>
            
            <label>Password
                <input type="password" placeholder="password" name="password">
            </label>
            
            <label>Description
                <textarea name="description" placeholder="About you"></textarea>
            </label>
                    <button class="button tiny" style="margin-left:40%; background: black">Sign up!</button>
        </fieldset>
    </form>
    
   <!--  <form action=""""),_display_(/*33.25*/routes/*33.31*/.Application.index()),format.raw/*33.51*/("""" method="GET" style="padding-top: 170px; padding-left: 20px">
        <fieldset style="width:400px">
            <p style="text-align:center">"""),_display_(/*35.43*/message),format.raw/*35.50*/("""<br /><br />
            <button class="button tiny" style="background: black">Back to Home</button></p>
        </fieldset>
    </form>  -->
</div>

""")))}),format.raw/*41.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:23:00 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/signup.scala.html
                  HASH: 0105bb913db8aa801798b6dc2258de2f5af09d69
                  MATRIX: 747->1|859->18|887->21|948->74|987->76|1015->78|1089->126|1103->132|1151->160|2296->1278|2311->1284|2352->1304|2523->1448|2551->1455|2732->1606
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|64->33|64->33|64->33|66->35|66->35|72->41
                  -- GENERATED --
              */
          