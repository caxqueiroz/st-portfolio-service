package io.pivotal.portfolio;


import io.pivotal.portfolio.config.IntegrationTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PortfolioApplication.class)
@Category(IntegrationTests.class)
public class PortfolioApplicationTest {
	/**
	 * test loading of spring context.
	 */
	@Test
	public void contextLoads() {
	}
}
