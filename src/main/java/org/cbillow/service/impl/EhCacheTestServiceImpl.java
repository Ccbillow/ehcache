package org.cbillow.service.impl;

import org.cbillow.service.EhCacheTestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Created by Cbillow
 * @date 16/6/30
 * @time 22:14
 */
@Service
public class EhCacheTestServiceImpl implements EhCacheTestService {


    @Cacheable(value = "cacheTest", key = "#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

}
