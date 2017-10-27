package cn.com.gxt.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
 * 项目级别的配置信息。<br>
 * 
 * @author ume-team
 */
@Configuration
@ComponentScan(basePackages = "cn.com.gxt,org.umeframework.wechat")
public class AppAutoConfiguration {
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
		MessageProperties instance = new org.umeframework.dora.message.impl.MessagePropertiesImpl("config/gongxiaotong-service/wechat");
		return instance;
	}
	
	@Scope("singleton")
	@Bean(name = "wechatUserLoginService")
	public UserLoginService wechatUserLoginService(@Autowired @Qualifier("wechatUserAuthenticator") UserAuthenticator<UserEntity> userAuthenticator) {
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
	
	

	// Add project configuration item here

}
