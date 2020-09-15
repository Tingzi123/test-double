package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    private static class MockDoorPanel extends DoorPanel{
        void close() {
            Stream.of("East Door", "West Door", "North Door", "South Door")
                    .forEach((door) -> {
                    /*
                    第一步：调用第三方服务连接开关门系统接口...
                    第二步：调用第三方服务检查门的开关状态...
                    第三步：调用第三方服务检查门开关系统是否正常
                    第四步：请求关门
                    第五步：自动关门
                    第六步：检查门是否成功关闭
                    第七步：检查门关闭后其他系统是否正常
                    */
                        System.out.println(door + "is closed");
                    });
        }
    }

    @BeforeEach
    public void setUp() {
        DoorPanel doorPanel=new DoorPanel();
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        SecurityCenter securityCenter=new SecurityCenter(new DoorPanel());
        securityCenter.switchOn();
    }
}
