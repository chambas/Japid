package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
import static cn.bran.WebUtils.*;
import static cn.bran.play.PlayTemplateVarsAdapter.*;
// NOTE: This file was generated from: japidviews/_tags/Display.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class Display extends TagLayout{
	public static final String sourceTemplate = "japidviews/_tags/Display.html";
	public static final String contentType = "text/html";
static String static_0 = ""
;
static String static_1 = "\n" + 
"\n" + 
"<div class=\"divvy\">\n" + 
"	<p>title: "
;
static String static_2 = "</p>\n" + 
"	<p>at: "
;
static String static_3 = "</p>\n" + 
"	<p>by: "
;
static String static_4 = ", "
;
static String static_5 = "</p>\n" + 
"	"
;
static String static_6 = "\n" + 
"</div>"
;
	public Display(StringBuilder out) {
		super(out);
	}
	cn.bran.Post post;
	String as;
	DoBody body;
	public static interface DoBody<A> {
		 void render(A a);
	}
	public cn.bran.japid.template.RenderResult render(cn.bran.Post post,	String as, DoBody body) {
		this.body = body;
		this.post = post;
		this.as = as;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResult(this.contentType, getOut(), t);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
// line 1
p(static_1);// line 5
p(post.getTitle());// line 8
p(static_2);// line 8
p(format(post.getPostedAt(), ("yy-MMM-dd")));// line 9
p(static_3);// line 9
p(post.getAuthor().name);// line 10
p(static_4);// line 10
p(post.getAuthor().gender);// line 10
p(static_5);// line 10
if (body != null)
	body.render(post.getTitle());
// line 11
p(static_6);// line 11

	}
}
