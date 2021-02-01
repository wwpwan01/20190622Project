package com.wwp.druid;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;

public class LocalStatLogger extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger{
 
	public void log(DruidDataSourceStatValue statValue){}
		
	
}
