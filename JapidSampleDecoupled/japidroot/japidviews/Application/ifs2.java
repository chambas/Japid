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
// NOTE: This file was generated from: japidviews/Application/ifs2.html
// Change to this file will be lost next time the template file is compiled.
//
public class ifs2 extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/ifs2.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
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


	public ifs2() {
		super(null);
	}
	public ifs2(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"i", "ss",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"int", "String[]",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.ifs2.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private int i; // line 1
	private String[] ss; // line 1
	public cn.bran.japid.template.RenderResult render(int i,String[] ss) {
		this.i = i;
		this.ss = ss;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"\n" + 
"<p>\n" + 
"OK, the minimalism if-else statement, no parenthesis, no braces, like command \n" + 
"</p>\n" + 
"\n" + 
"<pre>\n" + 
"    `if expr\n" + 
"        xxx\n" + 
"    `else if expr\n" + 
"        yyy\n" + 
"    `else\n" + 
"        zzz\n" + 
"    `\n" + 
"</pre>\n" + 
"\n" + 
"<p>\n" + 
"    is equals to\n" + 
"</p>\n" + 
"<p>\n" + 
"<pre>\n" + 
"    `if(asBoolean(expr)){\n" + 
"        xxx\n" + 
"    `} else if(asBoolean(expr)){\n" + 
"        yyy\n" + 
"    `} else {\n" + 
"        zzz\n" + 
"    `}\n" + 
"</pre>\n" + 
"\n" + 
"<p/>\n");// line 4
		if(asBoolean(ss)) {// line 35
		p("    well got ss\n" + 
"    ");// line 35
		final Each _Each0 = new Each(getOut()); _Each0.setOut(getOut()); _Each0.render(// line 37
ss, new Each.DoBody<String>(){ // line 37
public void render(final String s, final int _size, final int _index, final boolean _isOdd, final String _parity, final boolean _isFirst, final boolean _isLast) { // line 37
// line 37
		p("        call a tag\n" + 
"        ");// line 37
		final SampleTag _SampleTag1 = new SampleTag(getOut()); _SampleTag1.setActionRunners(getActionRunners()).setOut(getOut()); _SampleTag1.render(s); // line 39// line 39
    
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 37
} else if(asBoolean(ss)) {// line 41
		p("    finally got ");// line 41
		p(ss);// line 42
		p("\n" + 
"    ");// line 42
		final Each _Each2 = new Each(getOut()); _Each2.setOut(getOut()); _Each2.render(// line 43
ss, new Each.DoBody<String>(){ // line 43
public void render(final String s, final int _size, final int _index, final boolean _isOdd, final String _parity, final boolean _isFirst, final boolean _isLast) { // line 43
// line 43
		p("        call a tag\n" + 
"        ");// line 43
		final SampleTag _SampleTag3 = new SampleTag(getOut()); _SampleTag3.setActionRunners(getActionRunners()).setOut(getOut()); _SampleTag3.render(s); // line 45// line 45
    
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 43
} else {// line 47
    if(asBoolean("assd")) {// line 48
		p("        a true\n" + 
"    ");// line 48
		} else {// line 50
		p("        a false\n" + 
"    ");// line 50
		}// line 52
		p("    ss is empty\n");// line 52
		}// line 54
		p("\n");// line 54
		
		endDoLayout(sourceTemplate);
	}

}