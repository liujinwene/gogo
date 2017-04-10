package com.gogo.order;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gogo.base.core.CoreServerApp;
import com.gogo.schema.Tables;
import com.gogo.schema.tables.BbOrder;
import com.gogo.schema.tables.records.BbOrderRecord;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreServerApp.class)
@WebAppConfiguration
public class OrderTest {
	
	@Autowired
	private DSLContext dsl;
	
	@Test
	public void listByCd() {
		Result<BbOrderRecord> result = dsl.selectFrom(Tables.BB_ORDER).fetch();
		result.map(r -> {
			System.out.println(r.get("order_no"));
			return r;
		});
		
	}
}
