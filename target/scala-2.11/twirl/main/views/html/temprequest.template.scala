
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object temprequest_Scope0 {
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

class temprequest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html lang="en">
<head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*3.50*/routes/*3.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*3.97*/("""">
    <link rel="stylesheet" href=""""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("stylesheets/foundation.min.css")),format.raw/*4.92*/("""">
    <script type='text/javascript' src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.versioned("javascripts/foundation.min.js")),format.raw/*5.98*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.versioned("javascripts/jquery.raty.js")),format.raw/*6.95*/("""'></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    """),format.raw/*9.98*/("""
    """),format.raw/*10.5*/("""<script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.66*/("""" type="text/javascript"></script>
</head>
<body>
    <div id="topbar" style="width: 100%; float: top">
        <nav class="top-bar" data-topbar role="navigation" style="background: black; padding-left: 15px">
          <ul class="title-area">
            <li class="name">
              <h1>
              <a href="#"><center>
                <img src=""""),_display_(/*19.28*/routes/*19.34*/.Assets.versioned("images/yoda.png")),format.raw/*19.70*/("""" width="80px"; style="float: left">
              </a></center>
              </h1>
            </li>
          </ul>
          <section class="top-bar-section">
            <!-- Right Nav Section -->
            <ul class="right">
              <li style="width:200px">
                <center><a href="#" style="font-family: initial; color: white">Hello Surashree!</a></center>
              </li>
            </ul>
          </section>
        </nav>
    </div>
    <div id="container" style="width: 88%; height: 100%; float: right">
        <div style="padding-left: 10px; padding-top: 10px; padding-right: 10px; padding-bottom: 50px; height: 100%">
            <div class="panel callout radius" style="float: left; height: 100%; width: 50%; margin-right: 5px; overflow: auto">
              <h5><b><center><u>Search tutors</u></center></b></h5>
              <div class="panel callout radius" style="background: white;">
                  <form>
                  <div class="row">
                    <div class="large-12 columns">
                      <label>Course:
                        <select>
                            <option value="" disabled>Select a course</option>
                            <option value="4111">Introduction to Databases</option>
                            <option value="4112" selected="true" >Operating Systems I</option>
                            <option value="4156">Advanced Software Engineering</option>
                            <option value="4705">Natural Language Processing</option>
                        </select>
                      </label>
                    </div>
                  </div>
                  </form>
              </div>
              <hr>
              <div class="panel callout radius" style="background: white; font-family: initial">
                 <div id="tutor-name" style="float: left"><p><b>Justin Beiber</b></p></div>
                 <div id="tutor-rating" style="float: right">****</div>
                 <br>
                 <div id="tutor-info" style="float: left">
                    Hi! I am a second-year Ph.D student @CU. My research includes work on operating systems,
                    virtualization, thin-client computing, cloud computing, and mobile computing. <br></p>
                 </div>
                 <a href="#" class="button tiny" style="background: black">Request Session with Justin</a>
              </div>
              <div class="panel callout radius" style="background: white; font-family: initial">
                 <div id="tutor-name" style="float: left"><p><b>Jane Doe</b></p></div>
                 <div id="tutor-rating" style="float: right">***</div>
                 <br>
                 <div id="tutor-info" style="float: left">
                    I am a second year CS Masters student at Columbia.
                    I was the TA for Operating Systems I last semester.<br></p>
                 </div>
                 <a href="#" class="button tiny" style="background: black">Request Session with Jane</a>
              </div>
            </div>
            <div class="panel callout radius" style="float: right; height: 100%; width: 49%; background: white">
                <h5><b><center><u>Request a Session</u></center></b></h5>
                <br>
                <form>
                  <div class="row">
                    <div class="large-12 columns">
                      <label>Tutor
                        <input type="text" placeholder="" value="Justin Beiber" disabled/>
                      </label>
                    </div>
                  </div>
                  <div class="row">
                    <div>
                        <div class="large-4 columns" style="float: left">
                            <label>From
                                <input id="from" type="text" placeholder="HH:MM" />
                            </label>
                        </div>
                        <div id="from-time" style="float: left; width: 50px">
                            <label>&nbsp;
                            <select>
                                <option value="am">AM</option>
                                <option value="pm">PM</option>
                            </select>
                            </label>
                        </div>
                    </div>
                    <div>
                        <div class="large-4 columns" style="float: left">
                            <label>To
                                <input id="to" type="text" placeholder="HH:MM" />
                            </label>
                        </div>
                        <div id="to-time" style="float: left; width: 50px">
                            <label>&nbsp;
                            <select>
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
                        <select>
                          <option value="carleton">Carleton Commons</option>
                          <option value="cslounge">CS Lounge</option>
                          <option value="butler">Butler Group Study Room</option>
                          <option value="lerner">Lerner</option>
                        </select>
                      </label>
                    </div>
                  </div>
                  <div class="row">
                    <div class="large-12 columns">
                      <label>Add a message for Justin...
                        <textarea placeholder="small-12.columns"></textarea>
                      </label>
                    </div>
                  </div>
                  <a href="#" class="button tiny" style="background: black; margin-left: 190px">Confirm</a>
                </form>
            </div>
        </div>
    </div>
    <div id="content" style="width: 12%; height: 100%; float: left; background: black">
        <div class="icon-bar large-vertical four-up" style="background: black; padding-left: 5px;">
          <a class="item" style="font-family: initial">
            <img src=""""),_display_(/*147.24*/routes/*147.30*/.Assets.versioned("images/profile.jpg")),format.raw/*147.69*/("""" >
            <label>My Profile</label>
          </a>
          <a class="item" style="font-family: initial">
            <img src=""""),_display_(/*151.24*/routes/*151.30*/.Assets.versioned("images/mysessions.png")),format.raw/*151.72*/("""" >
            <label>My Sessions</label>
          </a>
          <a class="item active" style="font-family: initial">
            <img src=""""),_display_(/*155.24*/routes/*155.30*/.Assets.versioned("images/request.jpg")),format.raw/*155.69*/("""" >
            <label>Request Session</label>
          </a>
          <a class="item" style="font-family: initial">
            <img src=""""),_display_(/*159.24*/routes/*159.30*/.Assets.versioned("images/beatutor.jpg")),format.raw/*159.70*/("""" >
            <label>Be a tutor</label>
          </a>
          <a class="item" style="font-family: initial">
            <img src=""""),_display_(/*163.24*/routes/*163.30*/.Assets.versioned("images/logout.png")),format.raw/*163.68*/("""" >
            <label>Log out</label>
          </a>
          <a class="item" style="font-family: initial">
            <img src=""""),_display_(/*167.24*/routes/*167.30*/.Assets.versioned("images/about.jpg")),format.raw/*167.67*/("""" >
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
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object temprequest extends temprequest_Scope0.temprequest
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:23:00 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/temprequest.scala.html
                  HASH: 91d719febf2f354ad7bf3c3995f67909e889cd30
                  MATRIX: 839->0|938->73|952->79|1013->120|1076->157|1090->163|1161->214|1231->258|1245->264|1315->314|1394->367|1408->373|1475->420|1567->486|1581->492|1641->531|1769->725|1801->730|1842->744|1857->750|1919->791|2301->1146|2316->1152|2373->1188|8830->7618|8846->7624|8907->7663|9071->7799|9087->7805|9151->7847|9323->7991|9339->7997|9400->8036|9569->8177|9585->8183|9647->8223|9811->8359|9827->8365|9887->8403|10048->8536|10064->8542|10123->8579
                  LINES: 32->1|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|41->10|41->10|41->10|41->10|50->19|50->19|50->19|178->147|178->147|178->147|182->151|182->151|182->151|186->155|186->155|186->155|190->159|190->159|190->159|194->163|194->163|194->163|198->167|198->167|198->167
                  -- GENERATED --
              */
          