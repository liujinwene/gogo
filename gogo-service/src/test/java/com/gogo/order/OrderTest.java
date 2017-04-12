package com.gogo.order;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gogo.base.core.CoreServerApp;
import com.gogo.base.utils.JsonUtil;
import com.gogo.schema.Tables;
import com.gogo.schema.tables.records.BbOrderRecord;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreServerApp.class)
@WebAppConfiguration
public class OrderTest {
	
	@Autowired
	private DSLContext dsl;
	
	@Test
	@Ignore
	public void test1() {
		Result<BbOrderRecord> result = dsl.selectFrom(Tables.BB_ORDER).fetch();
		result.map(r -> {
			System.out.println(r.getOrderNo());
			return r;
		});
	}
	
	@Test
	public void test2() {
		Result<BbOrderRecord> result = dsl.selectFrom(Tables.BB_ORDER).fetch();
		result.map(r -> {
			System.out.println(JsonUtil.toJsonString(r));
			return r;
		});
	}
}
