package stub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    /*private static  class MockGradeSystem extends GradeSystem{
        @Override
        public List<Double> gradesFor(long studentId) {
            return Arrays.asList(80.0, 90.0, 100.0);
        }
    }*/
    @Mock
    private GradeSystem mockGradeSystem;

    @InjectMocks
    private GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        gradeService.calculateAverageGrades(1);
        verify(mockGradeSystem,times(1)).gradesFor(1);
    }
}
