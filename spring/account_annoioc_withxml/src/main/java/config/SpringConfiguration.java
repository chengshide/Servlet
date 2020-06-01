package config;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ������һ�������࣬�������ú�bean.xml��һ����
 * spring�е���ע��
 * Configuration
 *    ���ã�ָ����ǰ����һ��������
 *    ϸ�ڣ�����������ΪAnnototionConfigApplicationContext���󴴽��Ĳ���ʱ����ע����Բ�д
 *ComponentScan
 *    ���ã�����ͨ��ע��ָ��spring�ڴ�������ʱҪɨ��İ�
 *    ���ԣ�
 *       value������basePackages��������һ���ģ���������ָ����������ʱҪɨ��İ���
 *              ��ע���ͬ����xml�������ˣ� <context:component-scan base-package="com.icoom"></context:component-scan>
 *Bean
 *    ���ã����ڰѵ�ǰ�����ķ���ֵ��Ϊbean�������spring��IOC������
 *    ���ԣ�
 *        name:����ָ��bean��id������дʱ��Ĭ��ֵ�ǵ�ǰ����������
 *    ϸ�ڣ�
 *        ��ʹ��ע�����÷���ʱ����������в�����spring��ܻ�ȥ�����в�����û�п��õ�bean����
 *        ���ҵķ�ʽ��Autowiredע���������һ����
 *Import
 *    ���ã����� ����������������
 *    ���ԣ�
 *       value������ָ��������������ֽ��롣
 *PropertySource
 *    ���ã�����ָ��properties�ļ���λ��
 *    ���ԣ�
 *        value:ָ���ļ������ƺ�·��
 *             �ؼ��֣�classpath����ʾ��·����
 *              
 * @author �ľ�ؼ�¼�
 *
 */
@Configuration
@ComponentScan("com.icoom")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
