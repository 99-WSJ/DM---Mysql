package com.dbtimer.dbupdatespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author luhui
 */
@RestController
public class DbController {
	
	/**
	 * 注入jdbcTemplate模板对象
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/queryDbVersion")
	public List queryDbVersion() {
		List<Map<String, Object>> list1 = jdbcTemplate.queryForList("SELECT banner as 版本信息 FROM v$version");
//		List<Map<String, Object>> list1 = jdbcTemplate.queryForList("select version()");
//		List<Map<String, Object>> list2 = jdbcTemplate.queryForList("SHOW DATABASES like 'boji%'");
//		List<Map<String, Object>> list3 = jdbcTemplate.queryForList("SELECT  * FROM ledger_seller;");
		List<Map<String, Object>> list2 = jdbcTemplate.queryForList("select TABLE_NAME as tbName from all_tables where OWNER ='SYSDBA' ");
		List<Map<String, Object>> list3 = jdbcTemplate.queryForList("SELECT COUNT(*)  FROM TEST.ledger_supplier");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list3);
		return list2;
	}
}
