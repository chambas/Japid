package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/index.html
// Change to this file will be lost next time the template file is compiled.
//
public class index extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/index.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
		setTraceFile(false);
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"c",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Category",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.index.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Category c; // line 3
	public cn.bran.japid.template.RenderResult render(Category c) {
		this.c = c;
		long t = -1;
		 t = System.nanoTime();
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 3
     	String l = "" + (System.nanoTime() - t) / 100000;
		int len = l.length();
		l = l.substring(0, len - 1) + "." +  l.substring(len - 1);

		System.out.println("[index] rendering time(ms): " + l);
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
;// line 2
		p("\n" + 
"<h2>Sample Templates that demonstrate Japid features.</h2>\n" + 
"\n" + 
"<p>Please follow the controller actions and render paths for the\n" + 
"source code.</p>\n" + 
"\n" + 
"<ul>\n" + 
"	<li><a href=\"");// line 3
		p(lookup("hello", new Object[]{}));// line 10
		p("\">Hello Japid, using an overridden\n" + 
"	version of renderText()</a></li>\n" + 
"	<li><a href=\"application/callTag\">using tags in a template</a></li>\n" + 
"	<li><a href=\"go/templates/def.html\"><em>def</em>\n" + 
"	tag: define a method that return a string that can be invoked from\n" + 
"	super template. Compare this to the <b>set</b> tag</a></li>\n");// line 10
		p("\n" + 
"	<li><a href=\"more.Portlets/index\">demo how to composite a\n" + 
"	page with independent segments with the <b>invoke</b> tag</a></li>\n" + 
"\n" + 
"	<li><a href=\"application/renderByPosition\">implicit template\n" + 
"	binding with <b>JapidController.renderJapid()</b> </a></li>\n" + 
"	\n" + 
"	<li><a href=\"application/postList\">a template with template\n" + 
"	and tags etc...</a></li>\n" + 
"	\n" + 
"	<li><a href=\"go/templates/log.html\">use the log\n" + 
"	macro in a template. watch the output in the console</a></li>\n" + 
"	<li><a href=\"go/templates/Msg.html\">i18n, use\n" + 
"	predefined messages</a></li>\n" + 
"	<li><a href=\"application/postlist\">looping and tag calling</a></li>\n" + 
"	<li><a href=\"application/each\">the \"open for\" loop and the now deprecated \"*Each* tag</a></li>\n" + 
"	<li><a href=\"application/ifs2\">open if statement: minimalistic if-else statement can can take any expression rather than boolean values as the condition.</a>\n" + 
"	   <p>example: </p>\n" + 
"	   <pre>\n" + 
"		    `if expr\n" + 
"		        xxx\n" + 
"		    `else if expr\n" + 
"		        yyy\n" + 
"		    `else\n" + 
"		        zzz\n" + 
"		    `\n" + 
"	   </pre>\n" + 
"	</li>\n" + 
"	<li><a href=\"application/invokeInLoop\">using invoke tag with\n" + 
"	local variables requires final attribute</a></li>\n" + 
"	<li><a href=\"go/templates/suppressNull.html\">suppressNull,\n" + 
"	a directive to allow safe navigation in expression, default off</a></li>\n" + 
"	<li><a href=\"application/dumpPost\">show how to dump a post\n" + 
"	detail with japid.dump.request spec in the application.conf. see\n" + 
"	console for output.</a></li>\n" + 
"	<li><a href=\"application/cacheWithRenderJapid?a=hi\">cache with\n" + 
"	renderJapid</a></li>\n" + 
"	<li><a href=\"application/testCacheFor\">using the CacheFor\n" + 
"	annotation</a></li>\n" + 
"	<li><a href=\"application/in\">action forwarding with\n" + 
"	dontRedirect() from JapidController</a></li>\n" + 
"	<li><a href=\"go/templates/openBrace.html\"> use\n" + 
"	`{ in if and while </a></li>\n" + 
"	<li><a href=\"application/escapedExpr\"> ");// line 20
		p("\n" + 
"	raw expression with ${} and html-safe expression with ~{}\n" + 
"	");// line 63
		p("	</li>\n" + 
"	<li><a href=\"more.ContentNegotiation/index\"> content\n" + 
"	negotiation.</a> Use tools like CURL to test it: <pre>curl -i -H \"Accept: application/json\" http://127.0.0.1:9000/more.ContentNegotiation/index</pre>\n" + 
"	<p>Content negotiation works with renderJapid(), which does\n" + 
"	implicit parameter binding and template picking.</p>\n" + 
"	<p>For more doc: see <a\n" + 
"		href=\"http://www.playframework.org/documentation/1.1/routes#content-negotiation\">Play\n" + 
"	Content Negotiation</a></p>\n" + 
"	</li>\n" + 
"	<li><a href=\"more.MyController/quickview\"> Use relative path\n" + 
"	in layout spec and tags</a>: prefix the layout name or the tag name with a\n" + 
"	dot \".\" to let the compiler prefix the path with the current package.\n" + 
"	This saves using the full and long class qualifications.</li>\n" + 
"\n");// line 65
		String na = "bran";// line 80
int ag = 123;// line 81
		p("	<li><a href=\"");// line 81
		p(lookup("validate", na, ag));// line 82
		p("\">validation and errors</a></li>\n" + 
"    <li> using the <em>flash</em> object\n" + 
"		<ul>\n" + 
"			<li><a href=\"application/flashgood\">flash with success</a></li>\n" + 
"			<li><a href=\"");// line 82
		p(lookup("reverseUrl", new Object[]{}));// line 86
		p("\">flash with a message</a></li>\n" + 
"			<li><a href=\"application/flashbad\">flash with errors</a></li>\n" + 
"			<li><a href=\"application/flashmsg\">flash with a message</a></li>\n" + 
"		</ul>\n" + 
"    </li>\n" + 
"    <li>\n" + 
"	   ");// line 86
		 SearchParams sp = new  SearchParams("key1, key2", "AND");// line 92
		p("	   <a href=\"");// line 92
		p(lookup("search", sp));// line 93
		p("\">reverse URL lookup with complex object</a>\n" + 
"    ");// line 93
		p("\n" + 
"	</li>\n" + 
"	<li><a href=\"");// line 95
		p(lookupStatic("/public/images/favicon.png"));// line 97
		p("\">reverse to a static  png</a></li>\n" + 
"</ul>\n" + 
"\n" + 
"<p>Reverse lookup is slow...</p>\n" + 
"\n" + 
"<p>app mode: \"");// line 97
		p(_play.mode);// line 102
		p("\"</p>\n" + 
"\n" + 
"-->\"");// line 102
		p(c.name);// line 104
		p("\" , \n" + 
"\"");// line 104
		p(c.subname);// line 105
		p("\"\n");// line 105
		p("\n");// line 107
		
		endDoLayout(sourceTemplate);
	}

}