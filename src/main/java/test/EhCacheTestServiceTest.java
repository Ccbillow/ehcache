package test;

import org.cbillow.service.EhCacheTestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Created by Cbillow
 * @date 16/6/30
 * @time 22:22
 */
public class EhCacheTestServiceTest extends SpringTestCase {

    @Autowired
    private EhCacheTestService ehCacheTestService;

    @Test
    public void getTimestampTest() throws InterruptedException {
        System.out.println("第一次调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒后调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("再过11秒后调用(过期，将保存新的缓存)：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒后调用：" + ehCacheTestService.getTimestamp("param"));
    }
}
