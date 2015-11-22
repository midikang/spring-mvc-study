spring-mvc-study log
----------
	Nov 21, 2015 8:33:30 PM org.apache.catalina.startup.Catalina load
	INFO: Initialization processed in 2399 ms
	20:33:33 [localhost-startStop-1] ContextLoader - Root WebApplicationContext: initialization started
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletConfigInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletContextInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [jndiProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,jndiProperties,systemProperties,systemEnvironment]
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Replacing [servletContextInitParams] PropertySource with [servletContextInitParams]
	20:33:33 [localhost-startStop-1] XmlWebApplicationContext - Refreshing Root WebApplicationContext: startup date [Sat Nov 21 20:33:33 CST 2015]; root of context hierarchy
	20:33:33 [localhost-startStop-1] XmlBeanDefinitionReader - Loading XML bean definitions from ServletContext resource [/WEB-INF/spring/root-context.xml]
	20:33:33 [localhost-startStop-1] XmlWebApplicationContext - Bean factory for Root WebApplicationContext: org.springframework.beans.factory.support.DefaultListableBeanFactory@4f0ad380: defining beans [csrfFilter,requestDataValueProcessor]; root of factory hierarchy
	20:33:33 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate MessageSource with name 'messageSource': using default [org.springframework.context.support.DelegatingMessageSource@5494edbb]
	20:33:33 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate ApplicationEventMulticaster with name 'applicationEventMulticaster': using default [org.springframework.context.event.SimpleApplicationEventMulticaster@af80021]
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletConfigInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletContextInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [jndiProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,jndiProperties,systemProperties,systemEnvironment]
	20:33:33 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate LifecycleProcessor with name 'lifecycleProcessor': using default [org.springframework.context.support.DefaultLifecycleProcessor@3b7b65f8]
	20:33:33 [localhost-startStop-1] ContextLoader - Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
	20:33:33 [localhost-startStop-1] ContextLoader - Root WebApplicationContext: initialization completed in 640 ms
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletConfigInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletContextInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [jndiProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,jndiProperties,systemProperties,systemEnvironment]
	20:33:33 [localhost-startStop-1] DelegatingFilterProxy - Initializing filter 'csrfFilter'
	20:33:33 [localhost-startStop-1] DelegatingFilterProxy - Filter 'csrfFilter' configured successfully
	20:33:33 [localhost-startStop-1] DispatcherServlet - Initializing servlet 'appServlet'
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletConfigInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [servletContextInitParams] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [jndiProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
	20:33:33 [localhost-startStop-1] StandardServletEnvironment - Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,jndiProperties,systemProperties,systemEnvironment]
	20:33:34 [localhost-startStop-1] DispatcherServlet - FrameworkServlet 'appServlet': initialization started
	20:33:34 [localhost-startStop-1] DispatcherServlet - Servlet with name 'appServlet' will try to create custom WebApplicationContext context of class 'org.springframework.web.context.support.XmlWebApplicationContext', using parent context [Root WebApplicationContext: startup date [Sat Nov 21 20:33:33 CST 2015]; root of context hierarchy]
	20:33:34 [localhost-startStop-1] StandardServletEnvironment - Replacing [servletContextInitParams] PropertySource with [servletContextInitParams]
	20:33:34 [localhost-startStop-1] StandardServletEnvironment - Replacing [servletConfigInitParams] PropertySource with [servletConfigInitParams]
	20:33:34 [localhost-startStop-1] XmlWebApplicationContext - Refreshing WebApplicationContext for namespace 'appServlet-servlet': startup date [Sat Nov 21 20:33:34 CST 2015]; parent: Root WebApplicationContext
	20:33:34 [localhost-startStop-1] XmlBeanDefinitionReader - Loading XML bean definitions from ServletContext resource [/WEB-INF/spring/appServlet/servlet-context.xml]
	20:33:34 [localhost-startStop-1] XmlBeanDefinitionReader - Loading XML bean definitions from ServletContext resource [/WEB-INF/spring/appServlet/controllers.xml]
	20:33:34 [localhost-startStop-1] XmlWebApplicationContext - Bean factory for WebApplicationContext for namespace 'appServlet-servlet': org.springframework.beans.factory.support.DefaultListableBeanFactory@7e81d27a: defining beans [mvcResourceUrlProvider,org.springframework.web.servlet.handler.MappedInterceptor#0,org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0,mvcPathMatcher,mvcUrlPathHelper,mvcCorsConfigurations,org.springframework.web.servlet.handler.SimpleUrlHandlerMapping#0,org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping,org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter,org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter,org.springframework.web.servlet.view.InternalResourceViewResolver#0,multipartResolver,org.springframework.web.servlet.config.viewControllerHandlerMapping,simpleController,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,org.springframework.context.event.internalEventListenerProcessor,org.springframework.context.event.internalEventListenerFactory,org.springframework.context.annotation.internalAsyncAnnotationProcessor,org.springframework.context.annotation.internalScheduledAnnotationProcessor]; parent: org.springframework.beans.factory.support.DefaultListableBeanFactory@4f0ad380
	20:33:34 [localhost-startStop-1] AutowiredAnnotationBeanPostProcessor - JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
	20:33:34 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate MessageSource with name 'messageSource': using default [org.springframework.context.support.DelegatingMessageSource@12fc1b3]
	20:33:34 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate ApplicationEventMulticaster with name 'applicationEventMulticaster': using default [org.springframework.context.event.SimpleApplicationEventMulticaster@6655cf60]
	20:33:34 [localhost-startStop-1] SimpleUrlHandlerMapping - Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Looking for URL mappings in application context: WebApplicationContext for namespace 'appServlet-servlet': startup date [Sat Nov 21 20:33:34 CST 2015]; parent: Root WebApplicationContext
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'mvcResourceUrlProvider': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.handler.MappedInterceptor#0': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'mvcPathMatcher': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'mvcUrlPathHelper': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'mvcCorsConfigurations': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.handler.SimpleUrlHandlerMapping#0': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.view.InternalResourceViewResolver#0': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'multipartResolver': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.web.servlet.config.viewControllerHandlerMapping': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'simpleController': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalRequiredAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalCommonAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.event.internalEventListenerProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.event.internalEventListenerFactory': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalAsyncAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.internalScheduledAnnotationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'environment': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'systemProperties': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'systemEnvironment': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'servletConfig': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importRegistry': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'messageSource': no URL paths identified
	20:33:34 [localhost-startStop-1] BeanNameUrlHandlerMapping - Rejected bean name 'applicationEventMulticaster': no URL paths identified
	20:33:34 [localhost-startStop-1] SimpleUrlHandlerMapping - Root mapping to handler of type [class org.springframework.web.servlet.mvc.ParameterizableViewController]
	20:33:35 [localhost-startStop-1] XmlWebApplicationContext - Unable to locate LifecycleProcessor with name 'lifecycleProcessor': using default [org.springframework.context.support.DefaultLifecycleProcessor@43880664]
	20:33:35 [localhost-startStop-1] DispatcherServlet - Using MultipartResolver [org.springframework.web.multipart.commons.CommonsMultipartResolver@697afe5]
	20:33:35 [localhost-startStop-1] DispatcherServlet - Unable to locate LocaleResolver with name 'localeResolver': using default [org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver@6fb5a33b]
	20:33:35 [localhost-startStop-1] DispatcherServlet - Unable to locate ThemeResolver with name 'themeResolver': using default [org.springframework.web.servlet.theme.FixedThemeResolver@7520aea8]
	20:33:35 [localhost-startStop-1] DispatcherServlet - No HandlerExceptionResolvers found in servlet 'appServlet': using default
	20:33:35 [localhost-startStop-1] DispatcherServlet - Unable to locate RequestToViewNameTranslator with name 'viewNameTranslator': using default [org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@4bdc8c55]
	20:33:35 [localhost-startStop-1] DispatcherServlet - Unable to locate FlashMapManager with name 'flashMapManager': using default [org.springframework.web.servlet.support.SessionFlashMapManager@724f83b4]
	20:33:35 [localhost-startStop-1] ResourceUrlProvider - Looking for resource handler mappings
	20:33:35 [localhost-startStop-1] ResourceUrlProvider - Found resource handler mapping: URL pattern="/resources/**", locations=[ServletContext resource [/resources/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@424fd90d]
	20:33:35 [localhost-startStop-1] ResourceUrlProvider - Looking for resource handler mappings
	20:33:35 [localhost-startStop-1] ResourceUrlProvider - Found resource handler mapping: URL pattern="/resources/**", locations=[ServletContext resource [/resources/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@424fd90d]
	20:33:35 [localhost-startStop-1] DispatcherServlet - Published WebApplicationContext of servlet 'appServlet' as ServletContext attribute with name [org.springframework.web.servlet.FrameworkServlet.CONTEXT.appServlet]
	20:33:35 [localhost-startStop-1] DispatcherServlet - FrameworkServlet 'appServlet': initialization completed in 1360 ms
	20:33:35 [localhost-startStop-1] DispatcherServlet - Servlet 'appServlet' configured successfully
	Nov 21, 2015 8:33:35 PM org.apache.catalina.startup.Catalina start
	INFO: Server startup in 5739 ms
