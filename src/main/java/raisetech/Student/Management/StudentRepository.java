package raisetech.Student.Management;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface StudentRepository {

@Select("SELECT * FROM students")
List<Student> search();

//@Insert("INSERT student values(#{name}, #{age})")
  //  void registerStudent(String name, int age);

//@Update("UPDATE student SET age =#{age} WHERE name = #{name}")
  //  void updateStudent(String name,int age);

//@Delete("DELET FROM stuent EHERE name = #{name}")
  //  void deleteStudent(String name);
}
