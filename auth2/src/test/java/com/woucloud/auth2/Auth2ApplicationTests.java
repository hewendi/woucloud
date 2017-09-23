package com.woucloud.auth2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.woucloud.auth2.HelloController;

// http://blog.csdn.net/huazhongkejidaxuezpp/article/details/48662833  TestNG 安装
// http://www.51testing.com/html/58/n-3721258-2.html  testng 配置
// http://www.51testing.com/html/22/n-3721022.html UI自动化测试jenkins环境
// http://www.51testing.com/html/87/n-3720887.html jenkins+ant+jmeter接口自动化测试（持续构建）
// http://www.51testing.com/html/56/n-3720356.html ant+jmeter接口
// http://www.51testing.com/html/58/n-3719058.html jmeter 实现DB数据与接口数据的匹配校验
// http://www.51testing.com/html/60/n-3719860.html Jmeter连接DB2/ORACLE/MYSQL数据库
// https://segmentfault.com/a/1190000010813240   Spring、Spring Boot和TestNG测试指南 - 测试Spring MVC
// http://testng.org/doc/documentation-main.html  TestNG
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Auth2Application.java)
//@WebApplication

@RunWith(SpringRunner.class)
@SpringBootTest
public class Auth2ApplicationTests {

	private MockMvc mvc;
	
	@Before
	public void setup() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}
	
	@Test
	public void hello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().string(equalTo("Hello World")));
	}
	
	/*@Test
	public void contextLoads() {
	}*/

}