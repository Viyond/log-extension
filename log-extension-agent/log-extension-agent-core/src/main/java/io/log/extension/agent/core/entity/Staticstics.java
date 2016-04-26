package io.log.extension.agent.core.entity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Staticstics {
	
	private volatile long total;
	private volatile long success;
	private volatile long fail;
	private Map<String, MessageInfo> infos = new ConcurrentHashMap<String, MessageInfo>();

}