package cn.com.gxt.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
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
 * 供销通服务平台启动用入口程序及配置定义。<br>
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
//@ImportResource("classpath:config/gongxiaotong-service/initDataConfiguration.xml")
@ComponentScan(basePackages = "cn.com.gxt,org.umeframework.wechat")
public class Application {

	/**
	 * SpringApplication启动主程序。<br>
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

	// 以下是该项目自定义的实例配置
	/**
	 * 默认的用户登录鉴权实例。<br>
	 * 
	 * @return
	 */
	@Bean(name = "userAuthenticator")
	public UserAuthenticator<?> userAuthenticator() {
		UserAuthenticator<UserAuthDto> instance = new DefaultAuthenticatorImpl();
		return instance;
	}

	/**
	 * 微信服务器通信用HttpClient实例。<br>
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "urlEncodedHttpProxy")
	public HttpProxy urlEncodedHttpProxy() throws Exception {
		HttpProxyImpl instance = new HttpProxyImpl();
		instance.setAppContentType("application/x-www-form-urlencoded");
		instance.setEntityContentType("application/x-www-form-urlencoded");
		instance.setEntityCharset("UTF-8");
		instance.setParamCharset("UTF-8");
		instance.setUseSSL(false);
		return instance;
	}

	/**
	 * 微信服务调用相关的配置实例。<br>
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

	/**
	 * 微信登录服务实例。<br>
	 * 
	 * @param userAuthenticator
	 * @return
	 */
	@Scope("singleton")
	@Bean(name = "wechatUserLoginService")
	public UserLoginService wechatUserLoginService(
			@Autowired @Qualifier("wechatUserAuthenticator") UserAuthenticator<UserEntity> userAuthenticator) {
		UserLoginServiceImpl instance = new UserLoginServiceImpl();
		instance.setUserAuthenticator(userAuthenticator);
		instance.setSingleLogin(false);
		return instance;
	}

	/**
	 * 微信登录用鉴权实例。<br>
	 * 
	 * @return
	 */
	@Bean(name = "wechatUserAuthenticator")
	public UserAuthenticator<?> wechatUserAuthenticator() {
		WechatUserCodeAuthenticatorImpl instance = new WechatUserCodeAuthenticatorImpl();
		return instance;
	}
}
