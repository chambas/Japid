package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/superheaders.html
// Change to this file will be lost next time the template file is compiled.
//
public abstract class superheaders extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/superheaders.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		putHeader("Cache-Control", "max-age=300");
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


	public superheaders() {
		super(null);
	}
	public superheaders(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		beginDoLayout(sourceTemplate);		;// line 1
		p("\n" + 
"\n");// line 1
		p("\n" + 
"<p> there is a special directive for the content-type header</p>\n");// line 4
		p("\n" + 
"    `contentType    text/html; charset=utf-8\n");// line 7
		p("\n");// line 9
		doLayout();// line 11
		;// line 11
				endDoLayout(sourceTemplate);	}

	protected abstract void doLayout();
}