
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mysessions_Scope0 {
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

class mysessions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[Session],List[Session],List[Session],List[Session],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(requestedSessions : List[Session])(upcomingSessions : List[Session])(completedSessions : List[Session])(tutoringRequests : List[Session])(userId : Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.158*/("""

"""),_display_(/*3.2*/home(session().get("connected"))/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

    """),format.raw/*5.5*/("""<div id="container" style="width: 88%; height: 100 %; float: right">
        <div id="filter-sessions" style="height: 10 % ; float : left">
            <ul class="tabs" data-tab>
                <li id="panel1" class="tab-title" style="width: 281px; text-align : center">
                    <a onclick="showHideSections(1,'requested-sessions')" style="font-family : initial">
                        Requested Sessions</a>
                </li>
                <li id="panel2" class="tab-title active" style="width: 281px; text-align : center">
                    <a onclick="showHideSections(2,'upcoming-sessions')" style="font-family : initial">
                        Upcoming Sessions</a>
                </li>
                <li id="panel3" class="tab-title" style="width: 281px; text-align : center">
                    <a onclick="showHideSections(3,'completed-sessions')" style="font-family : initial">
                        Completed Sessions</a>
                </li>
                <li id="panel4" class="tab-title" style="width: 281px; text-align : center">
                    <a onclick="showHideSections(4,'tutoring-requests')" style="font-family : initial">
                        Tutoring Requests</a>
                </li>
            </ul>
        </div>
        <div id="upcoming-sessions" class="main-content" style="width : 100% ; padding-left : 10px ; float : left; height: 600px; overflow: auto;">
            <table>
                <thead>
                    <tr>
                        <th width="800px"><center>Session details</center></th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*34.22*/for(s <- upcomingSessions) yield /*34.48*/ {_display_(Seq[Any](format.raw/*34.50*/("""
                        """),format.raw/*35.25*/("""<tr>
                            <td>
                                <div class="panel callout radius">
                                    <!--<p>Tutor: <b>"""),_display_(/*38.55*/s/*38.56*/.tutor_name),format.raw/*38.67*/("""</b></p>
                                    <p>Tutee: <b>"""),_display_(/*39.51*/s/*39.52*/.tutee_name),format.raw/*39.63*/("""</b></p>
                                    <p>Course: <i>"""),_display_(/*40.52*/s/*40.53*/.course_name),format.raw/*40.65*/("""</i></p>
                                    <p>Time: """),_display_(/*41.47*/s/*41.48*/.scheduled_time.toString),format.raw/*41.72*/("""</p>
                                    <p>Location : """),_display_(/*42.52*/s/*42.53*/.location),format.raw/*42.62*/("""</p>-->
                                    <img src=""""),_display_(/*43.48*/routes/*43.54*/.Assets.versioned("images/location.svg")),format.raw/*43.94*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*44.109*/s/*44.110*/.location),format.raw/*44.119*/("""</div>
                                    <br><br>
                                    <img src=""""),_display_(/*46.48*/routes/*46.54*/.Assets.versioned("images/clock.png")),format.raw/*46.91*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*47.109*/s/*47.110*/.scheduled_time.toString),format.raw/*47.134*/("""</div>
                                    <br><br>
                                    <img src=""""),_display_(/*49.48*/routes/*49.54*/.Assets.versioned("images/book.png")),format.raw/*49.90*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*50.109*/s/*50.110*/.course_name),format.raw/*50.122*/("""</div>
                                    <br><br>
                                    <div style="float: left; font-size: 15px; font-family: initial">
                                        Session will be held by """),_display_(/*53.66*/s/*53.67*/.tutor_name),format.raw/*53.78*/(""" """),format.raw/*53.79*/("""(Tutor) with """),_display_(/*53.93*/s/*53.94*/.tutee_name),format.raw/*53.105*/(""" """),format.raw/*53.106*/("""(Tutee)
                                    </div>
                                </div>
                            </td>
                        </tr>
                    """)))}),format.raw/*58.22*/("""
                """),format.raw/*59.17*/("""</tbody>
            </table>
        </div>

        <div id="tutoring-requests" class="main-content" style="width : 100% ; padding-left : 10px ; float : left; height: 600px; overflow: auto;">
            <table>
                <thead>
                    <tr>
                        <th width="800px"><center>Session details</center></th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*72.18*/for(s <- tutoringRequests) yield /*72.44*/ {_display_(Seq[Any](format.raw/*72.46*/("""

                    """),_display_(/*74.22*/if(s.tutor_id == userId)/*74.46*/ {_display_(Seq[Any](format.raw/*74.48*/("""
                        """),format.raw/*75.25*/("""<tr>
                            <td>
                                <div class="panel callout radius">
                                    <img src=""""),_display_(/*78.48*/routes/*78.54*/.Assets.versioned("images/location.svg")),format.raw/*78.94*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*79.109*/s/*79.110*/.location),format.raw/*79.119*/("""</div>
                                    <br><br>
                                    <img src=""""),_display_(/*81.48*/routes/*81.54*/.Assets.versioned("images/clock.png")),format.raw/*81.91*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*82.109*/s/*82.110*/.scheduled_time.toString),format.raw/*82.134*/("""</div>
                                    <br><br>
                                    <img src=""""),_display_(/*84.48*/routes/*84.54*/.Assets.versioned("images/book.png")),format.raw/*84.90*/("""" width="15px"; style="float: left;">
                                    <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*85.109*/s/*85.110*/.course_name),format.raw/*85.122*/("""</div>
                                    <br><br>
                                    <div style="float: left; font-size: 15px; font-family: initial">
                                        Session will be held by you, """),_display_(/*88.71*/s/*88.72*/.tutor_name),format.raw/*88.83*/(""" """),format.raw/*88.84*/("""(Tutor), requested by """),_display_(/*88.107*/s/*88.108*/.tutee_name),format.raw/*88.119*/(""" """),format.raw/*88.120*/("""(Tutee)
                                    </div>
                                    <br><br>
                                    <div>
                                        <div class="large-12 columns">
                                            <label>Personal message (e.g. if declining, why?) <label id="TutorLabel"></label>
                                                <textarea id="reply" name="reply" placeholder="Enter a personalized message..."></textarea>
                                            </label>
                                        </div>
                                        <button class="button tiny" style="background : green ; margin-left : 50px" onclick="acceptClicked("""),_display_(/*97.141*/s/*97.142*/.session_id),format.raw/*97.153*/(""")">
                                            Accept</button>
                                        <button class="button tiny" style="background : red ; margin-left : 50px" onclick="rejectClicked("""),_display_(/*99.139*/s/*99.140*/.session_id),format.raw/*99.151*/(""")">
                                            Decline</button>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    """)))}),format.raw/*105.22*/("""
                """)))}),format.raw/*106.18*/("""
                """),format.raw/*107.17*/("""</tbody>
            </table>
        </div>
        <div id="requested-sessions" class="main-content" style="width : 100% ; padding-left : 10px ; float : left; height: 600px; overflow: auto;">
            <table>
                <thead>
                    <tr>
                        <th width="800px"><center>Session details</center></th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*119.18*/for(s <- requestedSessions) yield /*119.45*/ {_display_(Seq[Any](format.raw/*119.47*/("""
                    """),format.raw/*120.21*/("""<tr>
                        <td>
                            <div class="panel callout radius">
                                <img src=""""),_display_(/*123.44*/routes/*123.50*/.Assets.versioned("images/location.svg")),format.raw/*123.90*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*124.105*/s/*124.106*/.location),format.raw/*124.115*/("""</div>
                                <br><br>
                                <img src=""""),_display_(/*126.44*/routes/*126.50*/.Assets.versioned("images/clock.png")),format.raw/*126.87*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*127.105*/s/*127.106*/.scheduled_time.toString),format.raw/*127.130*/("""</div>
                                <br><br>
                                <img src=""""),_display_(/*129.44*/routes/*129.50*/.Assets.versioned("images/book.png")),format.raw/*129.86*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*130.105*/s/*130.106*/.course_name),format.raw/*130.118*/("""</div>
                                <br><br>
                                <div style="float: left; font-size: 15px; font-family: initial">
                                    Requested session will be held by """),_display_(/*133.72*/s/*133.73*/.tutor_name),format.raw/*133.84*/(""" """),format.raw/*133.85*/("""(Tutor) with """),_display_(/*133.99*/s/*133.100*/.tutee_name),format.raw/*133.111*/(""" """),format.raw/*133.112*/("""(Tutee)
                                </div>
                            </div>
                        </td>
                    </tr>
                """)))}),format.raw/*138.18*/("""
                """),format.raw/*139.17*/("""</tbody>
            </table>
        </div>
        <div id="completed-sessions" class="main-content" style="width : 100% ; padding-left : 10px ; float : left; height: 600px; overflow: auto;">
            <table>
                <thead>
                    <tr>
                        <th width="800px"><center>Session details</center></th>
                        <th width="300px"><center>Rating</center></th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*152.18*/for(s <- completedSessions) yield /*152.45*/ {_display_(Seq[Any](format.raw/*152.47*/("""
                    """),format.raw/*153.21*/("""<tr>
                        <td>
                            <div class="panel callout radius">
                                <img src=""""),_display_(/*156.44*/routes/*156.50*/.Assets.versioned("images/location.svg")),format.raw/*156.90*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*157.105*/s/*157.106*/.location),format.raw/*157.115*/("""</div>
                                <br><br>
                                <img src=""""),_display_(/*159.44*/routes/*159.50*/.Assets.versioned("images/clock.png")),format.raw/*159.87*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*160.105*/s/*160.106*/.scheduled_time.toString),format.raw/*160.130*/("""</div>
                                <br><br>
                                <img src=""""),_display_(/*162.44*/routes/*162.50*/.Assets.versioned("images/book.png")),format.raw/*162.86*/("""" width="15px"; style="float: left;">
                                <div style="float: left; font-size: 15px; font-family: initial">&nbsp; """),_display_(/*163.105*/s/*163.106*/.course_name),format.raw/*163.118*/("""</div>
                                <br><br>
                                <div style="float: left; font-size: 15px; font-family: initial">
                                    Session was held by """),_display_(/*166.58*/s/*166.59*/.tutor_name),format.raw/*166.70*/(""" """),format.raw/*166.71*/("""(Tutor) with """),_display_(/*166.85*/s/*166.86*/.tutee_name),format.raw/*166.97*/(""" """),format.raw/*166.98*/("""(Tutee)
                                </div>
                            </div>
                        </td>
                        """),_display_(/*170.26*/if(s.tutee_id == userId && s.rating == -1)/*170.68*/ {_display_(Seq[Any](format.raw/*170.70*/("""
                            """),format.raw/*171.29*/("""<td>
                                <div class="large-12 columns">
                                    <label>Did you like the session?
                                        <select id="rating"""),_display_(/*174.60*/s/*174.61*/.session_id),format.raw/*174.72*/("""">
                                        	<option value="0">Very Poor</option>
                                            <option value="1">* Poor, would not recommend</option>
                                            <option value="2">** Meh</option>
                                            <option value="3">*** Good</option>
                                            <option value="4">**** Great</option>
                                            <option value="5">***** Superb, definitely recommend</option>
                                        </select>
                                    </label>
                                </div>
                                <div class="large-12 columns">
                                    <label>Comments
                                        <textarea placeholder="Your experience, etc." id="comment"""),_display_(/*186.99*/s/*186.100*/.session_id),format.raw/*186.111*/(""""></textarea>
                                    </label>
                                </div>
                                <button class="button tiny" style="margin-left:40%; background: black" onclick="submitRating("""),_display_(/*189.127*/s/*189.128*/.session_id),format.raw/*189.139*/(""")">Submit</button>
                            </td>
                        """)))}/*191.27*/else/*191.32*/{_display_(Seq[Any](format.raw/*191.33*/(""" """),_display_(/*191.35*/if(s.tutor_id == userId && s.rating == -1)/*191.77*/ {_display_(Seq[Any](format.raw/*191.79*/("""
                            """),format.raw/*192.29*/("""<td>
                                <p>Waiting for your tutee to rate this session.</p>
                            </td>
                            """)))}/*195.31*/else/*195.36*/{_display_(Seq[Any](format.raw/*195.37*/(""" """),_display_(/*195.39*/if(s.rating != -1)/*195.57*/ {_display_(Seq[Any](format.raw/*195.59*/("""
                            """),format.raw/*196.29*/("""<td>
                                <p>This session was rated: """),_display_(/*197.61*/s/*197.62*/.rating),format.raw/*197.69*/("""/5</p>
                                <p>Comments: """),_display_(/*198.47*/s/*198.48*/.user_comment),format.raw/*198.61*/("""</p>
                            </td>
                        """)))})))})))}),format.raw/*200.28*/("""
                    """),format.raw/*201.21*/("""</tr>
                """)))}),format.raw/*202.18*/("""
                """),format.raw/*203.17*/("""</tbody>
            </table>
        </div>

        <div id="requestAccept" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="modalTitle">Request accepted</h2>
            <p>Awesome. Your tutee should receive your confirmation soon.</p>
            <a id="closeRequestAccept" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>

        <div id="requestReject" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="modalTitle">Request rejected</h2>
            <p>Maybe look into other session requests?</p>
            <a id="closeRequestReject" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>

        <div id="ratingSuccess" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="modalTitle">Thank you!</h2>
            <p>Your session rating has been successfully saved!</p>
            <a id="closeRatingSuccess" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>

        <div id="requestFail" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="modalTitle">... That is why you fail :x</h2>
            <p>Sorry! Request failed. Please try again!</p>
            <a id="closeRequestFail" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>

        <div id="bandialog" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
            <h2 id="banTitle">You are forced to logout</h2>
            <p>This account has been locked out due to suspicious behavior. If you feel this was done in error, please contact the administrator.</p>
            <a id="closeban" class="close-reveal-modal" aria-label="Close">&#215;</a>
        </div>
    </div>

    <div class="modal"><!-- Place at bottom of page --></div>

""")))}))
      }
    }
  }

  def render(requestedSessions:List[Session],upcomingSessions:List[Session],completedSessions:List[Session],tutoringRequests:List[Session],userId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(requestedSessions)(upcomingSessions)(completedSessions)(tutoringRequests)(userId)

  def f:((List[Session]) => (List[Session]) => (List[Session]) => (List[Session]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (requestedSessions) => (upcomingSessions) => (completedSessions) => (tutoringRequests) => (userId) => apply(requestedSessions)(upcomingSessions)(completedSessions)(tutoringRequests)(userId)

  def ref: this.type = this

}


}

/**/
object mysessions extends mysessions_Scope0.mysessions
              /*
                  -- GENERATED --
                  DATE: Tue Dec 22 17:22:59 EST 2015
                  SOURCE: /Users/KK/Documents/4156/final_project/yoda/app/views/mysessions.scala.html
                  HASH: 9437c2e45bac5a5a8d38e2f19afa03f1f6adbe66
                  MATRIX: 812->1|1064->157|1092->160|1132->192|1171->194|1203->200|2906->1876|2948->1902|2988->1904|3041->1929|3227->2088|3237->2089|3269->2100|3355->2159|3365->2160|3397->2171|3484->2231|3494->2232|3527->2244|3609->2299|3619->2300|3664->2324|3747->2380|3757->2381|3787->2390|3869->2445|3884->2451|3945->2491|4119->2637|4130->2638|4161->2647|4287->2746|4302->2752|4360->2789|4534->2935|4545->2936|4591->2960|4717->3059|4732->3065|4789->3101|4963->3247|4974->3248|5008->3260|5253->3478|5263->3479|5295->3490|5324->3491|5365->3505|5375->3506|5408->3517|5438->3518|5644->3693|5689->3710|6152->4146|6194->4172|6234->4174|6284->4197|6317->4221|6357->4223|6410->4248|6589->4400|6604->4406|6665->4446|6839->4592|6850->4593|6881->4602|7007->4701|7022->4707|7080->4744|7254->4890|7265->4891|7311->4915|7437->5014|7452->5020|7509->5056|7683->5202|7694->5203|7728->5215|7978->5438|7988->5439|8020->5450|8049->5451|8100->5474|8111->5475|8144->5486|8174->5487|8917->6202|8928->6203|8961->6214|9191->6416|9202->6417|9235->6428|9499->6660|9549->6678|9595->6695|10059->7131|10103->7158|10144->7160|10194->7181|10362->7321|10378->7327|10440->7367|10611->7509|10623->7510|10655->7519|10774->7610|10790->7616|10849->7653|11020->7795|11032->7796|11079->7820|11198->7911|11214->7917|11272->7953|11443->8095|11455->8096|11490->8108|11734->8324|11745->8325|11778->8336|11808->8337|11850->8351|11862->8352|11896->8363|11927->8364|12114->8519|12160->8536|12695->9043|12739->9070|12780->9072|12830->9093|12998->9233|13014->9239|13076->9279|13247->9421|13259->9422|13291->9431|13410->9522|13426->9528|13485->9565|13656->9707|13668->9708|13715->9732|13834->9823|13850->9829|13908->9865|14079->10007|14091->10008|14126->10020|14356->10222|14367->10223|14400->10234|14430->10235|14472->10249|14483->10250|14516->10261|14546->10262|14711->10399|14763->10441|14804->10443|14862->10472|15086->10668|15097->10669|15130->10680|16031->11553|16043->11554|16077->11565|16330->11789|16342->11790|16376->11801|16474->11880|16488->11885|16528->11886|16558->11888|16610->11930|16651->11932|16709->11961|16881->12114|16895->12119|16935->12120|16965->12122|16993->12140|17034->12142|17092->12171|17185->12236|17196->12237|17225->12244|17306->12297|17317->12298|17352->12311|17456->12377|17506->12398|17561->12421|17607->12438
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|65->34|65->34|65->34|66->35|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|77->46|77->46|77->46|78->47|78->47|78->47|80->49|80->49|80->49|81->50|81->50|81->50|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|89->58|90->59|103->72|103->72|103->72|105->74|105->74|105->74|106->75|109->78|109->78|109->78|110->79|110->79|110->79|112->81|112->81|112->81|113->82|113->82|113->82|115->84|115->84|115->84|116->85|116->85|116->85|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|128->97|128->97|128->97|130->99|130->99|130->99|136->105|137->106|138->107|150->119|150->119|150->119|151->120|154->123|154->123|154->123|155->124|155->124|155->124|157->126|157->126|157->126|158->127|158->127|158->127|160->129|160->129|160->129|161->130|161->130|161->130|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|169->138|170->139|183->152|183->152|183->152|184->153|187->156|187->156|187->156|188->157|188->157|188->157|190->159|190->159|190->159|191->160|191->160|191->160|193->162|193->162|193->162|194->163|194->163|194->163|197->166|197->166|197->166|197->166|197->166|197->166|197->166|197->166|201->170|201->170|201->170|202->171|205->174|205->174|205->174|217->186|217->186|217->186|220->189|220->189|220->189|222->191|222->191|222->191|222->191|222->191|222->191|223->192|226->195|226->195|226->195|226->195|226->195|226->195|227->196|228->197|228->197|228->197|229->198|229->198|229->198|231->200|232->201|233->202|234->203
                  -- GENERATED --
              */
          