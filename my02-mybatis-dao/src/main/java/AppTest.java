import com.chaofan.dao.StudentDao;
import com.chaofan.dao.impl.StudentDaoImpl;
import com.chaofan.pojo.Student;
import org.junit.Test;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 26 21:02
 */
public class AppTest {

    StudentDao dao = new StudentDaoImpl();

    @Test
    public void test1() {
        List<Student> students = dao.selectStudentAll();
        students.forEach(student -> System.out.println(student));
    }

}
