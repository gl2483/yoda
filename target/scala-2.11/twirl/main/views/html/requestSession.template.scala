
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object requestSession_Scope0 {
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

class requestSession extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Course],List[Tutor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courselist : List[Course])(tutorlist : List[Tutor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/home(session().get("connected"))/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""
        """),format.raw/*4.9*/("""<div id="container" style="width: 88%; height: 100%; float: right">
            <div style="padding-left: 10px; padding-top: 10px; padding-right: 10px; padding-bottom: 50px; height: 100%">
                <div class="panel callout radius" style="float: left; height: 100%; width: 50%; margin-right: 5px; overflow: auto">
                    <h5><b><center><u>Search tutors</u></center></b></h5>
                    <div class="panel callout radius" style="background: white;">
                        <form>
                            <div class="row">
                                <div class="large-12 columns">
                                    <label>Course:
                                        <select id="course" name="course">
                                            <option value="" disabled>Select a course</option>
                                            """),_display_(/*15.46*/for(c <- courselist) yield /*15.66*/ {_display_(Seq[Any](format.raw/*15.68*/("""
                                                """),format.raw/*16.49*/("""<option value="""),_display_(/*16.64*/c/*16.65*/.course_id),format.raw/*16.75*/(""">"""),_display_(/*16.77*/c/*16.78*/.name),format.raw/*16.83*/(""" """),format.raw/*16.84*/("""- """),_display_(/*16.87*/c/*16.88*/.description),format.raw/*16.100*/("""</option>
                                            """)))}),format.raw/*17.46*/("""
                                        """),format.raw/*18.41*/("""</select>
                                    </label>
                                </div>
                            </div>
                        </form>
                    </div>
                    <hr>
                    """),_display_(/*25.22*/for(t <- tutorlist) yield /*25.41*/{_display_(Seq[Any](format.raw/*25.42*/("""
                    """),format.raw/*26.21*/("""<div class="panel callout radius course-panel """),_display_(/*26.68*/t/*26.69*/.key.course_id),format.raw/*26.83*/("""" style="background: white; font-family: initial">
                        <div id="tutor-name" style="float: left"><p><b>"""),_display_(/*27.73*/t/*27.74*/.Tutor_name),format.raw/*27.85*/("""</b></p></div>
                        <div id="tutor-rating" style="float: right">Rating : """),_display_(/*28.79*/t/*28.80*/.rating),format.raw/*28.87*/("""</div>
                        <br/>
                        <div id="tutor-info">
                            <textarea rows="6" style="background-color:white;outline:none;border:none" readonly>"""),_display_(/*31.114*/t/*31.115*/.description),format.raw/*31.127*/("""</textarea>
                            <br/>
                        </div>
                        <p>
                            <br/>
                        <a href="#" class="button tiny" onclick="setTutorName('"""),_display_(/*36.81*/t/*36.82*/.Tutor_name),format.raw/*36.93*/("""', '"""),_display_(/*36.98*/t/*36.99*/.key.user_id),format.raw/*36.111*/("""')" style="background: black">Request Session with """),_display_(/*36.163*/t/*36.164*/.Tutor_name),format.raw/*36.175*/("""</a>
                        </p>
                    </div>
                    """)))}),format.raw/*39.22*/("""
                """),format.raw/*40.17*/("""</div>
                <div class="panel callout radius" style="float: right; height: 100%; width: 49%; background: white">
                    <h5><b><center><u>Request a Session</u></center></b></h5>
                    <br>
                    <form id="requestform" name="requestform">
                        <input type="hidden" id="coursename" name="coursename" value=""/>
                        <input type="hidden" id="courseid" name="courseid" value=""/>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Tutor
                                    <input type="text" id="TutorName" name="tutorname" placeholder=""  value="" readonly/>
                                    <input type="hidden" id="TutorId" name="tutorid" value="0"/>
                                </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Date: <input type="text" id="datepicker" name="datepicker"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div>
                                <div class="large-4 columns" style="float: left">
                                    <label>From
                                        <input id="from" type="text" name="from" placeholder="HH:MM" />
                                    </label>
                                </div>
                                <div style="float: left; width: 50px">
                                    <label>&nbsp;
                                        <select id="from-time" name ="from-time" >
                                            <option value="am">AM</option>
                                            <option value="pm">PM</option>
                                        </select>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Where would you like to meet up?
                                    <select id="location" name="location">
                                        <option value="Carleton Commons">Carleton Commons</option>
                                        <option value="CS Lounge">CS Lounge</option>
                                        <option value="Butler Group Study Room">Butler Group Study Room</option>
                                        <option value="Lerner">Lerner</option>
                                        <option value="Columbia Library Steps">Columbia Library Steps</option>
                                    </select>
                                </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="large-12 columns">
                                <label>Add a personalized message (e.g. what topics do you want to cover?) <label id="TutorLabel"></label>
                                    <textarea name="message" placeholder="Enter a personalized message..."></textarea>
                                </label>
                            </div>
                        </div>
                        <a href="#" id="addrequest" class="button tiny" style="background: black; margin-left: 190px">Confirm</a>
                    </form>
                </div>
            </div>
        </div>

        <div id="dialog" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="modalTitle"></h2>
            <p id="modalMessage"></p>
            <a id="closedialog" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>

        <div class="modal"><!-- Place at bottom of page --></div>
        
        <script src=""""),_display_(/*111.23*/routes/*111.29*/.Assets.versioned("javascripts/requestSession.js")),format.raw/*111.79*/("""" type="text/javascript"></script>


""")))}),format.raw/*114.2*/("""
"""))
      }
    }
  }

  def render(courselist:List[Course],tutorlist:List[Tutor]): play.twirl.api.HtmlFormat.Appendable = apply(courselist)(tutorlist)

  def f:((List[Course]) => (List[Tutor]) => play.twirl.api.HtmlFormat.Appendable) = (courselist) => (tutorlist) => apply(courselist)(tutorlist)

  def ref: this.type = this

}


}

/**/
object requestSession extends requestSession_Scope0.requestSession
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:23:00 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/requestSession.scala.html
                  HASH: 619e6e2ace04adedbdf26333ad5f5343b91d2864
                  MATRIX: 781->1|928->53|956->56|996->88|1034->89|1069->98|1979->981|2015->1001|2055->1003|2132->1052|2174->1067|2184->1068|2215->1078|2244->1080|2254->1081|2280->1086|2309->1087|2339->1090|2349->1091|2383->1103|2469->1158|2538->1199|2799->1433|2834->1452|2873->1453|2922->1474|2996->1521|3006->1522|3041->1536|3191->1659|3201->1660|3233->1671|3353->1764|3363->1765|3391->1772|3615->1968|3626->1969|3660->1981|3906->2200|3916->2201|3948->2212|3980->2217|3990->2218|4024->2230|4104->2282|4115->2283|4148->2294|4261->2376|4306->2393|8464->6523|8480->6529|8552->6579|8621->6617
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|49->18|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|70->39|71->40|142->111|142->111|142->111|145->114
                  -- GENERATED --
              */
          