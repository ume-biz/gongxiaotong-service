//package cn.com.gxt.app.config;
//
//import javax.annotation.Resource;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.umeframework.dora.appconfig.DefaultSystemPropertyConfiguration;
//
///**
// * APP默认主页的配置。<br>
// * 
// * @author ume-team
// */
//@Configuration
//public class AppHomePageConfiguration extends WebMvcConfigurerAdapter {
//
//	/**
//	 * 系统定义的常量组件实例。<br>
//	 */
//	@Resource(name = "systemPropertyConfiguration")
//	private DefaultSystemPropertyConfiguration systemPropertyConfiguration;
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
//	 */
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		String homePage = systemPropertyConfiguration.getHomePage();
//		registry.addViewController("/").setViewName("redirect:" + homePage);
//		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		super.addViewControllers(registry);
//	}
//}