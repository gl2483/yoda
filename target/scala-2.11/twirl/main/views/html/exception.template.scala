
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exception_Scope0 {
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

class exception extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""


"""),_display_(/*4.2*/main("GO AWAY!")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""

"""),format.raw/*6.1*/("""<div style="margin-left: 32%;">
    <form action=""""),_display_(/*7.20*/routes/*7.26*/.Application.index()),format.raw/*7.46*/("""" method="GET" style="padding-top: 170px; padding-left: 20px">
        <fieldset style="width:400px">
            <p style="text-align:center">"""),_display_(/*9.43*/message),format.raw/*9.50*/("""<br /><br />
                <button class="button tiny" style="background: black">Back to Home</button></p>
        </fieldset>
    </form>
</div>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object exception extends exception_Scope0.exception
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/exception.scala.html
                  HASH: 1c536392931a7dd6b0f904b279c035c6bd5c9630
                  MATRIX: 753->1|865->18|894->22|918->38|957->40|985->42|1062->93|1076->99|1116->119|1286->263|1313->270
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|38->7|38->7|38->7|40->9|40->9
                  -- GENERATED --
              */
          