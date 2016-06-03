
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/home(session().get("connected"))/*1.34*/{_display_(Seq[Any](format.raw/*1.35*/("""

    """),format.raw/*3.5*/("""<div id="container" style="width: 88%; height: 100%; float: right">
        <div style="padding-left: 300px; padding-right: 150px; padding-top: 5px; padding-bottom: 50px; height: 100%">
            <div class="panel callout radius" style="height: 100%; width: 500px; float: left">
                <img src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.versioned("images/yoda.png")),format.raw/*6.70*/("""" width="400px"; style="float: left; padding-left: 60px">
                <div id="about-info" style="padding-top: 200px">
                    <div class="panel" style="background: white; font-family: initial; text-align: center">
                      <p>
                        Yoda (v.1.0.1) is a simple way for students to request tutors for Computer Science courses.*<br><br>
                        Sign up as a student or a tutor, search for course tutors, request and confirm sessions, and you're all set!<br><br>
                        Currently, Yoda is accessible only to Columbia University students, and only for CS courses.
                        Further versions will work on changing this.
                      </p>
                      <p><i>
                        *This project is a submission by Cool Kids Anonymous for COMS W4156 Advanced Software Engineering.
                      </i></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/about.scala.html
                  HASH: 0f97ecb68d914cdabc8d11bab60f0a871bb3c607
                  MATRIX: 827->1|867->33|905->34|937->40|1271->348|1285->354|1341->390|2387->1406
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6|55->24
                  -- GENERATED --
              */
          