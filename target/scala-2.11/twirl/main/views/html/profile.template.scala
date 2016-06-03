
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/home(session().get("connected"))/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<div id="container" style="width: 88%; height: 100%; float: right">
        <div style="padding-left: 150px; padding-right: 150px; padding-top: 5px; padding-bottom: 50px; height: 100%">
            <div class="panel callout radius" style="height: 100%; float: left">
                <div id="profile-picture" style="width: 150px; float: left; padding-right: 5px">
                    <img src=""""),_display_(/*9.32*/routes/*9.38*/.Assets.versioned("images/smiley.jpg")),format.raw/*9.76*/("""" >
                </div>
                <div id="profile-info" style="width: 500px; height: 550px; float: right; margin-left: 10px; background: white;">
                    <div class="panel" style="">
                      <h5><b>"""),_display_(/*13.31*/user/*13.35*/.first_name),format.raw/*13.46*/(""" """),_display_(/*13.48*/user/*13.52*/.last_name),format.raw/*13.62*/("""</b></h5>
                      <br>
                      <i><u>Profile info</u></i><br>
                      Username: """),_display_(/*16.34*/user/*16.38*/.user_name),format.raw/*16.48*/("""<br>
                      <br>
                      Description: """),_display_(/*18.37*/user/*18.41*/.description),format.raw/*18.53*/("""
                      """),format.raw/*19.23*/("""<br>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*26.2*/("""

"""))
      }
    }
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/profile.scala.html
                  HASH: 505e6806cbfc4d5b1a25288c2c984abfbc5fabfd
                  MATRIX: 754->1|869->21|897->24|937->56|975->57|1007->63|1428->458|1442->464|1500->502|1762->737|1775->741|1807->752|1836->754|1849->758|1880->768|2030->891|2043->895|2074->905|2169->973|2182->977|2215->989|2266->1012|2398->1114
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|44->13|44->13|44->13|44->13|44->13|44->13|47->16|47->16|47->16|49->18|49->18|49->18|50->19|57->26
                  -- GENERATED --
              */
          