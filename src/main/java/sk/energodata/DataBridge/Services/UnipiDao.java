package sk.energodata.DataBridge.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import sk.energodata.DataBridge.Models.Student;
import sk.energodata.DataBridge.Models.Subject;
import sk.energodata.DataBridge.Models.Unipi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.*;

@Component
public class UnipiDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Unipi> getAllUnipiWithoutValues() {
        return jdbcTemplate.query("select * from tag_descs_ab_as_ke", rs -> {
            List<Unipi> unipiList = new ArrayList<>();
            while (rs.next()) {
                Unipi unipi = new Unipi();
                unipi.setId(rs.getLong("id"));
                unipi.setName(rs.getString("name"));
                unipi.setDescription(rs.getString("description"));
                unipi.setType(rs.getString("type"));
                unipi.setPhysicalType(rs.getString("physical_type"));
                unipi.setPhysicalDecimals(rs.getInt("physical_decimals"));
                unipi.setPhysicalUnit(rs.getString("physical_unit"));
                unipi.setPhysicalMin(rs.getDouble("physical_min"));
                unipi.setPhysicalMax(rs.getDouble("physical_max"));
                unipi.setPhysicalMinAlarm(rs.getDouble("physical_min_alarm"));
                unipi.setPhysicalMaxAlarm(rs.getDouble("physical_max_alarm"));
                unipi.setPhysicalMinWarn(rs.getDouble("physical_min_warn"));
                unipi.setPhysicalMaxWarn(rs.getDouble("physical_max_warn"));
                unipiList.add(unipi);
            }
            return unipiList;
        });
    }

    public List<Student> getAllStudentDetailsWithSubjects(LocalDateTime startDate, LocalDateTime endDate) {
             return jdbcTemplate.query("SELECT * FROM student st, subject sb where st.id = sb.student_id and sb.value_time BETWEEN ? AND ?", new Object[]{startDate, endDate}, new ResultSetExtractor<List<Student>>() {

        // extractData() is ResultSetExtractor
        // interface's method
        public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<Integer, Student> studentMap = new HashMap<>(); // mapa študentov
            while(rs.next()) {
                int studentId = rs.getInt(1);
                Student student;
                if (!studentMap.containsKey(studentId)) { // ak sa študent ešte nenachádza v mape, vytvoríme ho
                    student = new Student();
                    student.setId(studentId);
                    student.setName(rs.getString("name"));
                    student.setDepartment(rs.getString("department"));
                    student.setSubjectSet(new HashSet<>());
                    studentMap.put(studentId, student);
                } else { // ak sa študent už nachádza v mape, získame ho z mapy
                    student = studentMap.get(studentId);
                }
                Subject subject = new Subject(); // vytvoríme nový predmet
                subject.setId(rs.getLong(4));
                subject.setValueTime(rs.getTimestamp("value_time").toLocalDateTime());
                subject.setSubject(rs.getString("subject"));
                subject.setStudentId(Long.valueOf(studentId));
                student.getSubjectSet().add(subject); // pridáme predmet do množiny študenta
            }
            return new ArrayList<>(studentMap.values());
        }

    });
}
}
