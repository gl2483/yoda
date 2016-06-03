
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tutor_Scope0 {
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

class tutor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Course],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courselist : List[Course]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/home(session().get("connected"))/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<div id="container" style="width: 88%; height: 100%; float: right">
        <div style="padding-left: 300px; padding-right: 150px; padding-top: 5px; padding-bottom: 50px; height: 100%">
            <div class="panel callout radius" style="height: 100%; float: left; overflow: auto">
                <div id="profile-info" style="width: 500px; height: 550px; float: right; margin-left: 5px; background: white;">
                    <div class="panel" style="">
                      <h5><b><center>Be a tutor!</center></b></h5>
                      <br>
                      <form id="tutorform">
                        <div class="row">
                          <div class="large-12 columns">
                            <label>Say something about yourself!
                              <textarea id="description" name="description" style="height: 70px" placeholder="Ex. Your major @CU, interests, past experience, etc."></textarea>
                            </label>
                          </div>
                        </div>

                          <label>What courses would you like to tutor? (Choose at least one)
                          </label>
                        <div class="row">
                          <div class="large-12 columns">
                              <select id="course0" name="course0" class="courselist">
                                <option value="" selected="true" disabled>Select a course</option>
                                """),_display_(/*27.34*/for(c <- courselist) yield /*27.54*/ {_display_(Seq[Any](format.raw/*27.56*/("""
                                    """),format.raw/*28.37*/("""<option value="""),_display_(/*28.52*/c/*28.53*/.course_id),format.raw/*28.63*/(""">"""),_display_(/*28.65*/c/*28.66*/.name),format.raw/*28.71*/(""" """),format.raw/*28.72*/("""- """),_display_(/*28.75*/c/*28.76*/.description),format.raw/*28.88*/("""</option>
                                """)))}),format.raw/*29.34*/("""
                              """),format.raw/*30.31*/("""</select>
                          </div>

                        </div>
                        <a id="addmore" style="float: right; padding-right: 10px">+ Add </a>
                        <br><br>
                        <a id="addtutor" class="button tiny" style="margin-left: 180px; background: black">Confirm</a>
                      </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="tutorConfirm" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
        <h2 id="modalTitle">A teacher Yoda is.</h2>
        <p class="lead">Congratulations!</p>
        <p>You've signed up successfully as a tutor on Yoda. You will now be listed every time a student runs a search for tutors.</p>
        <a id="closeTutorConfirm" class="close-reveal-modal" aria-label="Close">&#215;</a>
    </div>

    <div id="tutorFailure1" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
        <h2 id="modalTitle">Hmm... something went wrong.</h2>
        <p class="lead">Sorry!</p>
        <p>Looks like you've already signed up as a tutor for this. Try again, maybe?</p>
        <a id="closeTutorFailure1" class="close-reveal-modal" aria-label="Close">&#215;</a>
    </div>

    <div id="tutorFailure2" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
        <h2 id="modalTitle">Hmm... something went wrong.</h2>
        <p class="lead">Sorry!</p>
        <p>You need to add at least one course to be a tutor. Try again, maybe?</p>
        <a id="closeTutorFailure2" class="close-reveal-modal" aria-label="Close">&#215;</a>
    </div>

    <div class="modal"><!-- Place at bottom of page --></div>
""")))}))
      }
    }
  }

  def render(courselist:List[Course]): play.twirl.api.HtmlFormat.Appendable = apply(courselist)

  def f:((List[Course]) => play.twirl.api.HtmlFormat.Appendable) = (courselist) => apply(courselist)

  def ref: this.type = this

}


}

/**/
object tutor extends tutor_Scope0.tutor
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:23:00 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/tutor.scala.html
                  HASH: e70575090239aa8087c8b916d0b6bafdafae0183
                  MATRIX: 751->1|873->28|901->31|941->63|979->64|1011->70|2523->1556|2559->1576|2599->1578|2664->1615|2706->1630|2716->1631|2747->1641|2776->1643|2786->1644|2812->1649|2841->1650|2871->1653|2881->1654|2914->1666|2988->1709|3047->1740
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30
                  -- GENERATED --
              */
          