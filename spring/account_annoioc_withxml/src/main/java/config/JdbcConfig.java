package config;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcConfig {
	
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;

	/**
	 * ���ڴ���һ��QueryRunner����
	 * @param dataSource
	 * @return
	 */
	@Bean(name="runner")
	@Scope("prototype")
	public QueryRunner createQueryRunner(DataSource dataSource) {
		return new QueryRunner(dataSource);
	}
	
	/**
	 * ��������Դ����
	 * @return
	 */
	@Bean(name="dataSource")
	public DataSource createDataSource() {
		try {
			ComboPooledDataSource ds = new ComboPooledDataSource();
			ds.setDriverClass(driver);
			ds.setJdbcUrl(url);
			ds.setUser(username);
			ds.setPassword(password);
			return ds;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
