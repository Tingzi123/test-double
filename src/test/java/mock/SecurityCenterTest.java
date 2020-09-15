package mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    /*private static class MockDoorPanel extends DoorPanel{
        private  Boolean closeBeCalled=false;

        @Override
        void close() {
            closeBeCalled=true;
        }

        public boolean isCloseBeCalled(){
            return closeBeCalled;
        }

    }*/

    @Mock
    private DoorPanel mockDoorPanel;

    @InjectMocks
    private SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(mockDoorPanel,times(1)).close();
    }
}
