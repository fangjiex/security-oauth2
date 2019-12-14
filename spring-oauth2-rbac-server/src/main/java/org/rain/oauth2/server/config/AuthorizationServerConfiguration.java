package org.rain.oauth2.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    WebSecurityConfiguration securityConfiguration;

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        // 配置数据源（注意，我使用的是 HikariCP 连接池），以上注解是指定数据源，否则会有冲突
        return DataSourceBuilder.create().build();
    }

    @Bean
    public TokenStore tokenStore() {
        // 基于 JDBC 实现，令牌保存到数据
        return new JdbcTokenStore(dataSource());
    }

    @Bean
    public ClientDetailsService jdbcClientDetails() {
        // 基于 JDBC 实现，需要事先在数据库配置客户端信息
        return new JdbcClientDetailsService(dataSource());
    }

//    @Bean
//    @Primary
//    public DefaultTokenServices defaultTokenServices(){
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        defaultTokenServices.setSupportRefreshToken(true);
//        defaultTokenServices.setReuseRefreshToken(false);
//        defaultTokenServices.setTokenStore(tokenStore());
//        return defaultTokenServices;
//    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.userDetailsService(securityConfiguration.userDetailsService());
        // 设置令牌
        endpoints.tokenStore(tokenStore());

        //endpoints.tokenServices(defaultTokenServices());

//        // 自定义确认授权页面
//        endpoints.pathMapping("/oauth/confirm_access", "/oauth/confirm_access");
//        // 自定义错误页
//        endpoints.pathMapping("/oauth/error", "/oauth/error");
//        // 自定义异常转换类
//        endpoints.exceptionTranslator(new OpenOAuth2WebResponseExceptionTranslator());
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        //security.tokenKeyAccess("permitAll()") // 开启/oauth/token_key验证端口无权限访问
          security.checkTokenAccess("isAuthenticated()");  // 开启/oauth/check_token验证端口认证权限访问
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 读取客户端配置
        clients.withClientDetails(jdbcClientDetails());
    }

}
