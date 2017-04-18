package com.gogo.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.ResultQuery;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Ignore;
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
	
	/**
	 * 原始jOOQ使用方式，自己创建连接
	 */
	@Test
	@Ignore
	public void pureQuery() throws SQLException {
		String url = "jdbc:mysql://121.199.69.107:3306/bb?useUnicode=true&characterEncoding=UTF-8&characterSetResults=UTF-8&useOldAliasMetadataBehavior=true&noAccessToProcedureBodies=true";
		String userName = "jw";
		String password = "3633";
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		DSLContext dsl = DSL.using(connection, SQLDialect.MYSQL);
		
		Result<BbOrderRecord> result = dsl.selectFrom(Tables.BB_ORDER).fetch();
		result.map(r -> {
			System.out.println(r.getOrderNo());
			return r;
		});
	}
	
	/**
	 * 无sql查询
	 */
	@Test
	@Ignore
	public void codeQuery() {
		Result<BbOrderRecord> result = dsl.selectFrom(Tables.BB_ORDER).fetch();
		result.map(r -> {
			System.out.println(r.getOrderNo());
			return r;
		});
	}
	
	/**
	 * 使用sql查询
	 */
	@Test
	public void sqlQuery() {
		String sql = dsl.select(Tables.BB_ORDER.fields()).from(Tables.BB_ORDER).getSQL();
		System.out.println("sql=" + sql);
		ResultQuery<Record> records = dsl.resultQuery(sql);
		for(Record record : records) {
			System.out.println(record.get(BbOrder.BB_ORDER.ORDER_NO));
		}
	}
	
}
