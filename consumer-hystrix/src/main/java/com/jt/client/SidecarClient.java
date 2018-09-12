package com.jt.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="sidecar")
public interface SidecarClient {
	@RequestMapping("/")
	public String node();
}
