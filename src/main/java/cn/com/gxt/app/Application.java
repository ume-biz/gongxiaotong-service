package cn.com.gxt.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.umeframework.dora.http.HttpProxy;
import org.umeframework.dora.http.impl.HttpProxyImpl;
import org.umeframework.dora.message.MessageProperties;
import org.umeframework.dora.service.UserEntity;
import org.umeframework.dora.service.user.UserAuthenticator;
import org.umeframework.dora.service.user.UserLoginService;
import org.umeframework.dora.service.user.impl.UserLoginServiceImpl;

import cn.com.gxt.uac.user.dto.UserAuthDto;
import cn.com.gxt.uac.user.impl.DefaultAuthenticatorImpl;
import cn.com.gxt.uac.user.impl.WechatUserCodeAuthenticatorImpl;

/**
 * Spring Boot启动用的主类<br>
 * 只需在该类的头部用注解标注的形式，即可启动一个内嵌Web服务器的Java项目<br>
 * <br>
 * Dora框架提供基于注解自动配置和基于XML配置两种方案，分别采用如下说明的方法来选择配置方式：<br>
 * <li>基于注解自动配置 - 在主类的头部添加"@ImportAutoConfiguration"设置
 * <li>基于注解自动配置 - 在主类的头部添加"@ImportResource"设置
 * <li>对于要从自动配置中排除的模块，使用"@EnableAutoConfiguration(exclude=...)"设置 <br>
 * <li>基于XML配置的场合，使用：@ImportResource("classpath:applicationContext.xml")<br>
 * <li>基于DORA自动配置，但不配置数据源的场合，使用：@ImportAutoConfiguration({
 * DoraAutoConfigurationNoDataSource.class})<br>
 * 
 * @author Yue MA
 */
// 排除SpringBoot自带的数据源初始化设置，采用application.properties中使用ume.jdbc设置的数据源连接。
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration.class,
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class })
// 导入项目的自动化配置。
@Import({
		// 启动UME框架的默认配置
		// org.umeframework.dora.appconfig.AutoConfiguration.class,
		org.umeframework.dora.appconfig.DefaultBeanFactoryConfiguration.class,
		org.umeframework.dora.appconfig.DefaultCacheManagerConfiguration.class,
		org.umeframework.dora.appconfig.DefaultDaoConfiguration.class,
		org.umeframework.dora.appconfig.DefaultDataSourceConfiguration.class,
		org.umeframework.dora.appconfig.DefaultExceptionHandlerConfiguration.class,
		org.umeframework.dora.appconfig.DefaultHttpProxyConfiguration.class,
		org.umeframework.dora.appconfig.DefaultJdbcDataSourceManagerConfiguration.class,
		org.umeframework.dora.appconfig.DefaultLogConfiguration.class,
		org.umeframework.dora.appconfig.DefaultLoginServiceConfiguration.class,
		org.umeframework.dora.appconfig.DefaultMessageConfiguration.class,
		org.umeframework.dora.appconfig.DefaultServiceAjaxConfiguration.class,
		org.umeframework.dora.appconfig.DefaultServiceInterceptChainConfiguration.class,
		org.umeframework.dora.appconfig.DefaultServiceInterceptConfiguration.class,
		org.umeframework.dora.appconfig.DefaultServiceMappingConfiguration.class,
		org.umeframework.dora.appconfig.DefaultServiceSecurityInterceptChainConfiguration.class,
		org.umeframework.dora.appconfig.DefaultSystemPropertyConfiguration.class,
		org.umeframework.dora.appconfig.DefaultTransactionManagerConfiguration.class,
		org.umeframework.dora.appconfig.DefaultWebControllerConfiguration.class })
// 该设置创建并导入示例用的数据库及数据脚本；如果应用(通过application.properties的ume.jdbc设置)已变更为其他的数据库，请删除此设置。
@ImportResource("classpath:config/gongxiaotong-service/initDataConfiguration.xml")
@ComponentScan(basePackages = "cn.com.gxt,org.umeframework.wechat")
public class Application {

	/**
	 * Start Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Throwable e) {
			if (!e.getClass().getName().startsWith("org.springframework.boot.devtools")) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 用户鉴权服务组件声明。<br>
	 * 
	 * @return
	 */
	@Bean(name = "userAuthenticator")
	public UserAuthenticator<?> userAuthenticator() {
		UserAuthenticator<UserAuthDto> instance = new DefaultAuthenticatorImpl();
		return instance;
	}

	/**
	 * httpProxy
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "urlEncodedHttpProxy")
	public HttpProxy httpProxy() throws Exception {
		HttpProxyImpl instance = new HttpProxyImpl();
		instance.setAppContentType("application/x-www-form-urlencoded");
		instance.setEntityContentType("application/x-www-form-urlencoded");
		instance.setEntityCharset("UTF-8");
		instance.setParamCharset("UTF-8");
		instance.setUseSSL(false);
		return instance;
	}

	/**
	 * wechatConfig
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "wechatConfig")
	public MessageProperties wechatConfig() throws Exception {
		MessageProperties instance = new org.umeframework.dora.message.impl.MessagePropertiesImpl(
				"config/gongxiaotong-service/wechat");
		return instance;
	}

	@Scope("singleton")
	@Bean(name = "wechatUserLoginService")
	public UserLoginService wechatUserLoginService(
			@Autowired @Qualifier("wechatUserAuthenticator") UserAuthenticator<UserEntity> userAuthenticator) {
		UserLoginServiceImpl instance = new UserLoginServiceImpl();
		instance.setUserAuthenticator(userAuthenticator);
		instance.setSingleLogin(false);
		return instance;
	}

	@Bean(name = "wechatUserAuthenticator")
	public UserAuthenticator<?> wechatUserAuthenticator() {
		WechatUserCodeAuthenticatorImpl instance = new WechatUserCodeAuthenticatorImpl();
		return instance;
	}
}
