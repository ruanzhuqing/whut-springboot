import cn.hutool.crypto.digest.DigestUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * TODO:测试密码加密
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Slf4j
public class PasswordTest {
    @Test
    public void passworfTest(){
        String passwd = DigestUtil.md5Hex("admin");
        if(log.isInfoEnabled()){
            log.info(passwd);
        }
    }
}
