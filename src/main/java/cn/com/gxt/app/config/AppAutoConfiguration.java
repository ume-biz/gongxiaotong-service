package cn.com.gxt.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.umeframework.dora.service.user.UserAuthenticator;
import cn.com.gxt.uac.user.impl.DefaultAuthenticatorImpl;
import cn.com.gxt.uac.user.dto.UserAuthDto;

/**
 * 项目级别的配置信息。<br>
 * 
 * @author ume-team
 */
@Configuration
// @ComponentScan(basePackages = "cn.com.gxt,org.umeframework.uac")
@ComponentScan(basePackages = "cn.com.gxt")
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

	// Add project configuration item here

}
