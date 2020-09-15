package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private static  class MockGradeSystem extends GradeSystem{
        @Override
        public List<Double> gradesFor(long studentId) {
            return Arrays.asList(80.0, 90.0, 100.0);
        }
    }

    private GradeService gradeService;
    @BeforeEach
    public void setup(){
        MockGradeSystem mockGradeSystem=new MockGradeSystem();
        gradeService=new GradeService(mockGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result=gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
