Midi's spring MVC Study project v0.1.0
--

QA
----
As we use springframework 4.2.2 which support servlet 3.0, if "Dynamic Web Module" in eclipse project facets is smaller than 3.0, change file

	./settings/org.eclipse.wst.common.project.facet.core.xml

	<?xml version="1.0" encoding="UTF-8"?>
	<faceted-project>
	  <fixed facet="wst.jsdt.web"/>
	  <installed facet="jst.web" version="3.0"/>
	  <installed facet="wst.jsdt.web" version="1.0"/>
	  <installed facet="java" version="1.7"/>
	</faceted-project>


Initialization project
----------
* Create maven web project
* Copy pom.xml from spring-mvc-showcase
* Copy web.xml and spring folder from spring-mvc-showcase


Create first controller
----------
	package org.infosys.sample.mvc.simple;
	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	
	@Controller
	public class SimpleController {
		
		@RequestMapping("/simple")
		public @ResponseBody String simple(){
			return "Hello Spring MVC!";
		}
	}

Change base-package accordingly	in webapp/WEB-INF/spring/appServlet/controller.xml
----------
From

	<context:component-scan base-package="org.springframework.samples.mvc" />

To

	<context:component-scan base-package="com.infosys.samples.mvc" />

Prepare home.jsp
----

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page session="false" %>
	<html>
		<head>
			<title>Spring MVC Study</title>
			<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
			<link href="<c:url value="/resources/jqueryui/1.8/themes/base/jquery.ui.core.css" />" rel="stylesheet" type="text/css"/>
			<link href="<c:url value="/resources/jqueryui/1.8/themes/base/jquery.ui.theme.css" />" rel="stylesheet" type="text/css"/>
			<link href="<c:url value="/resources/jqueryui/1.8/themes/base/jquery.ui.tabs.css" />" rel="stylesheet" type="text/css"/>
			
			<!--
			Used for including CSRF token in JSON requests
			Also see bottom of this file for adding CSRF token to JQuery AJAX requests
			-->
			<meta name="_csrf" content="${_csrf.token}"/>
			<meta name="_csrf_header" content="${_csrf.headerName}"/>
		</head>
		<body>
			<h1><a href="<c:url value="/" />">spring-mvc-showcase</a></h1>
			<div id="tabs">
				<ul>
					<li><a href="#simple">simple</a></li>
				</ul>
				<div id="simple">
					<h2>Simple</h2>
					<ul>
						<li>
							<a id="simpleLink" class="textLink" href="<c:url value="/simple"/>">Get /simple</a>
						</li>
					</ul>
				</div>
			</div>
			
		<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/jqueryform/2.8/jquery.form.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/jqueryui/1.8/jquery.ui.core.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/jqueryui/1.8/jquery.ui.widget.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/jqueryui/1.8/jquery.ui.tabs.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/json2.js" />"></script>
		<script>
			MvcUtil = {};
			MvcUtil.showSuccessResponse = function (text, element) {
				MvcUtil.showResponse("success", text, element);
			};
			MvcUtil.showErrorResponse = function showErrorResponse(text, element) {
				MvcUtil.showResponse("error", text, element);
			};
			MvcUtil.showResponse = function(type, text, element) {
				var responseElementId = element.attr("id") + "Response";
				var responseElement = $("#" + responseElementId);
				if (responseElement.length == 0) {
					responseElement = $('<span id="' + responseElementId + '" class="' + type + '" style="display:none">' + text + '</span>').insertAfter(element);
				} else {
					responseElement.replaceWith('<span id="' + responseElementId + '" class="' + type + '" style="display:none">' + text + '</span>');
					responseElement = $("#" + responseElementId);
				}
				responseElement.fadeIn("slow");
			};
			MvcUtil.xmlencode = function(xml) {
				//for IE 
				var text;
				if (window.ActiveXObject) {
				    text = xml.xml;
				 }
				// for Mozilla, Firefox, Opera, etc.
				else {
				   text = (new XMLSerializer()).serializeToString(xml);
				}			
				    return text.replace(/\&/g,'&'+'amp;').replace(/</g,'&'+'lt;')
			        .replace(/>/g,'&'+'gt;').replace(/\'/g,'&'+'apos;').replace(/\"/g,'&'+'quot;');
			};
		</script>	
		<script type="text/javascript">
		$(document).ready(function() {
			$("#tabs").tabs();
		
			// Append '#' to the window location so "Back" returns to the selected tab
			// after a redirect or a full page refresh (e.g. Views tab).
		
			// However, note this general disclaimer about going back to previous tabs: 
			// http://docs.jquery.com/UI/API/1.8/Tabs#Back_button_and_bookmarking
		
			$("#tabs").bind("tabsselect", function(event, ui) { window.location.hash = ui.tab.hash; });
		
		
			$("a.textLink").click(function(){
				var link = $(this);
				$.ajax({ url: link.attr("href"), dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, link); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, link); }});
				return false;
			});
		
			$("a.utf8TextLink").click(function(){
				var link = $(this);
				$.ajax({ url: link.attr("href"), dataType: "text", beforeSend: function(req) { req.setRequestHeader("Accept", "text/plain;charset=UTF-8"); }, success: function(text) { MvcUtil.showSuccessResponse(text, link); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, link); }});
				return false;
			});
		
			$("form.textForm").submit(function(event) {
				var form = $(this);
				var button = form.children(":first");
				$.ajax({ type: "POST", url: form.attr("action"), data: "foo", contentType: "text/plain", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("#readForm").submit(function() {
				var form = $(this);
				var button = form.children(":first");
				$.ajax({ type: "POST", url: form.attr("action"), data: "foo=bar&fruit=apple", contentType: "application/x-www-form-urlencoded", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("#writeForm").click(function() {
				var link = $(this);
				$.ajax({ url: this.href, dataType: "text", beforeSend: function(req) { req.setRequestHeader("Accept", "application/x-www-form-urlencoded"); }, success: function(form) { MvcUtil.showSuccessResponse(form, link); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, link); }});					
				return false;
			});
		
			$("form.readXmlForm").submit(function() {
				var form = $(this);
				var button = form.children(":first");
				$.ajax({ type: "POST", url: form.attr("action"), data: "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><javaBean><foo>bar</foo><fruit>apple</fruit></javaBean>", contentType: "application/xml", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("a.writeXmlLink").click(function() {
				var link = $(this);
				$.ajax({ url: link.attr("href"),
					beforeSend: function(req) { 
						if (!this.url.match(/\.xml$/)) {
							req.setRequestHeader("Accept", "application/xml");
						}
					},
					success: function(xml) {
						MvcUtil.showSuccessResponse(MvcUtil.xmlencode(xml), link);
					},
					error: function(xhr) { 
						MvcUtil.showErrorResponse(xhr.responseText, link);
					}
				});
				return false;
			});					
		
			$("form.readJsonForm").submit(function() {
				var form = $(this);
				var button = form.children(":first");
				var data = form.hasClass("invalid") ?
						"{ \"foo\": \"bar\" }" : 
						"{ \"foo\": \"bar\", \"fruit\": \"apple\" }";
				$.ajax({ type: "POST", url: form.attr("action"), data: data, contentType: "application/json", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("a.writeJsonLink").click(function() {
				var link = $(this);
				$.ajax({ url: this.href,
					beforeSend: function(req) {
						if (!this.url.match(/\.json$/)) {
							req.setRequestHeader("Accept", "application/json");
						}
					},
					success: function(json) {
						MvcUtil.showSuccessResponse(JSON.stringify(json), link);
					},
					error: function(xhr) {
						MvcUtil.showErrorResponse(xhr.responseText, link);
					}});
				return false;
			});
		
			$("#readAtom").submit(function() {
				var form = $(this);
				var button = form.children(":first");
				$.ajax({ type: "POST", url: form.attr("action"), data: '<?xml version="1.0" encoding="UTF-8"?> <feed xmlns="http://www.w3.org/2005/Atom"><title>My Atom feed</title></feed>', contentType: "application/atom+xml", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("#writeAtom").click(function() {
				var link = $(this);
				$.ajax({ url: link.attr("href"),
					beforeSend: function(req) { 
						req.setRequestHeader("Accept", "application/atom+xml");
					},
					success: function(feed) {
						MvcUtil.showSuccessResponse(MvcUtil.xmlencode(feed), link);
					},
					error: function(xhr) { 
						MvcUtil.showErrorResponse(xhr.responseText, link);
					}
				});
				return false;
			});
			
			$("#readRss").submit(function() {
				var form = $(this);
				var button = form.children(":first");
				$.ajax({ type: "POST", url: form.attr("action"), data: '<?xml version="1.0" encoding="UTF-8"?> <rss version="2.0"><channel><title>My RSS feed</title></channel></rss>', contentType: "application/rss+xml", dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, button); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, button); }});
				return false;
			});
		
			$("#writeRss").click(function() {
				var link = $(this);	
				$.ajax({ url: link.attr("href"),
					beforeSend: function(req) { 
						req.setRequestHeader("Accept", "application/rss+xml");
					},
					success: function(feed) {
						MvcUtil.showSuccessResponse(MvcUtil.xmlencode(feed), link);
					},
					error: function(xhr) { 
						MvcUtil.showErrorResponse(xhr.responseText, link);
					}
				});
				return false;
			});
		
			$("#byHeader").click(function(){
				var link = $(this);
				$.ajax({ url: this.href, dataType: "text", beforeSend: function(req) { req.setRequestHeader("FooHeader", "foo"); }, success: function(form) { MvcUtil.showSuccessResponse(form, link); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, link); }});
				return false;
			});
		
			// Include CSRF token as header in JQuery AJAX requests
			// See http://docs.spring.io/spring-security/site/docs/3.2.x/reference/htmlsingle/#csrf-include-csrf-token-ajax
			var token = $("meta[name='_csrf']").attr("content");
			var header = $("meta[name='_csrf_header']").attr("content");
			$(document).ajaxSend(function(e, xhr, options) {
				xhr.setRequestHeader(header, token);
			});
		
		});
		</script>
		</body>
	</html>